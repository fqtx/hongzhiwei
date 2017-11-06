import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Demo01 {
    //JUtil5
//    @Test
    public void test01(){
        List list = new ArrayList();
        Map map = new LinkedHashMap();
        map.put("a",1);
        map.put("b",2);
        list.add(map);
        //fastjson
//        String json = JSON.toJSONString(list);
//        System.out.println(json);
    }
}
