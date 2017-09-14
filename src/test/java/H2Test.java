/**
 * Created by zyz46160 on 2017/9/6.
 */

import com.alibaba.fastjson.JSON;
import com.zyz.bean.G16;
import com.zyz.bean.Tsi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * User: 张月忠
 * Date: 2017/9/6  12:18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/*.xml"})
public class H2Test {
    @Resource(name = "h2dataSource")
    private DataSource dataSource;
    @Test
    public void test() throws Exception {
        //g16:[]

        String g16json ="{\"afz3tariffcd\":\"\",\"afz3tariffnum\":\"\",\"areacd\":\"AL\",\"createId\":201709032301,\"createtime\":1504675976897,\"cxr\":\"AB\",\"deleteId\":0,\"disdate\":1463932800000,\"effdate\":1463932800000,\"ff4ast\":\"\",\"filler\":\"\",\"id\":174805,\"stamp\":1463932800000,\"type\":\"I\",\"updatetime\":1504675976897}";
        //JSON.parse(g16json);
       // JSONObject.too
        G16 g16 ;

        List<G16> g16List = new ArrayList<>(10000);
        Random r = new Random(23443267);
        for(int i=0;i<10000;i++){
            long l = r.nextLong();
            g16 = JSON.parseObject(g16json, G16.class);
            g16.setId(l);
             g16List.add(g16);
        }

        Long t1 = System.currentTimeMillis();
        jdbcInsertG16(g16List,201709060000L);
        Long t2 = System.currentTimeMillis();
        System.out.println("time:"+(t2-t1));

    }

    public void jdbcInsertG16(List<G16> newDatas, Long currentScheduleId ) throws Exception{
        String sql ="  insert  into T_G16 (ID, CREATE_ID, DELETE_ID," +
                "      AREACD, TYPE, CXR, FILLER," +
                "      EFFDATE, DISDATE, STAMP," +
                "      AFZ3TARIFFCD, AFZ3TARIFFNUM, FF4AST) values (?,?,?,?,?,?,?,?,?,?,?,?,? )";
        Connection connection =dataSource.getConnection();
        connection.setAutoCommit(false);

        PreparedStatement st = connection.prepareStatement(sql);
        int index = 0;
        for (G16 data:newDatas){
            st.setLong(1,data.getId());
            st.setLong(2,currentScheduleId);
            st.setLong(3,data.getDeleteId());
            st.setString(4,data.getAreacd());
            st.setString(5,data.getType());
            st.setString(6,data.getCxr());
            st.setString(7,data.getFiller());
            st.setDate(8,new Date(data.getEffdate().getTime()));
            st.setDate(9,new Date(data.getEffdate().getTime()));
            st.setDate(10,new Date(data.getEffdate().getTime()));
            st.setString(11,data.getAfz3tariffcd());
            st.setString(12,data.getAfz3tariffnum());
            st.setString(13,data.getFf4ast());
            st.addBatch();

        }
        st.executeBatch();
        connection.commit();
        connection.close();
    }

    @Test
    public void testTsi() throws Exception {
        List<Tsi> g16List = new ArrayList<>(100000);
        Random r = new Random(23443267);
        for(int i=0;i<100000;i++){
            long l = r.nextLong();
            Tsi tsi = new Tsi();
            tsi.setId(l);
            tsi.setAppl("D");
            tsi.setCreateTime(new java.util.Date());
            tsi.setDefinition("F");
            tsi.setFlag(1);
            tsi.setIo("I");
            tsi.setLocation("T");
            tsi.setUpdateTime(new java.util.Date());
            tsi.setTsi(1);
            tsi.setTsiPoint(4);
            g16List.add(tsi);
        }

        Long t1 = System.currentTimeMillis();
        jdbcInsertTsi(g16List);
        Long t2 = System.currentTimeMillis();
        System.out.println("time1:"+(t2-t1));
        g16List.clear();
        for(int i=0;i<100000;i++){
            long l = r.nextLong();
            Tsi tsi = new Tsi();
            tsi.setId(l);
            tsi.setAppl("D");
            tsi.setCreateTime(new java.util.Date());
            tsi.setDefinition("F");
            tsi.setFlag(1);
            tsi.setIo("I");
            tsi.setLocation("T");
            tsi.setUpdateTime(new java.util.Date());
            tsi.setTsi(1);
            tsi.setTsiPoint(4);
            g16List.add(tsi);
        }
        t1 = System.currentTimeMillis();
        jdbcInsertTsi(g16List);
         t2 = System.currentTimeMillis();
        System.out.println("time2:"+(t2-t1));
    }


    public void jdbcInsertTsi(List<Tsi> newDatas ) throws Exception{
        String sql =  "  insert into tsi (id, tsi, definition,   appl, tsi_point, io,  location, flag, create_time,  update_time) VALUES (?,?,?,?,?,?,?,?,?,?);";
        Connection connection =dataSource.getConnection();
        connection.setAutoCommit(false);

        PreparedStatement st = connection.prepareStatement(sql);
        for (Tsi data:newDatas){
            st.setLong(1,data.getId());
            st.setInt(2,data.getTsi());
            st.setString(3,data.getDefinition());
            st.setString(4,data.getAppl());
            st.setInt(5,data.getTsiPoint());
            st.setString(6,data.getIo());
            st.setString(7,data.getLocation());
            st.setInt(8,data.getFlag());
            st.setDate(9,new Date(data.getCreateTime().getTime()));
            st.setDate(10,new Date(data.getUpdateTime().getTime()));
            st.addBatch();

        }
        st.executeBatch();
        connection.commit();
        connection.close();
    }

}
