import java.util.ArrayList;
import java.util.List;

public class Test01 {

    public static void main(String[] args) {
        List<SkyWechatMenu> data = new ArrayList<>();
        SkyWechatMenu s1 = new SkyWechatMenu();
        s1.setId("1");
        s1.setParentId(null);

        SkyWechatMenu s2 = new SkyWechatMenu();
        s2.setId("2");
        s2.setParentId(null);

        SkyWechatMenu s3 = new SkyWechatMenu();
        s3.setId("3");
        s3.setParentId("2");

        SkyWechatMenu s4 = new SkyWechatMenu();
        s4.setId("4");
        s4.setParentId("2");

        SkyWechatMenu s5 = new SkyWechatMenu();
        s5.setId("5");
        s5.setParentId("2");

        data.add(s1);
        data.add(s2);
        data.add(s3);
        data.add(s4);
        data.add(s5);
        SkyWechatMenu s6 = new SkyWechatMenu();
        s6.setId("5");
        s6.setParentId("2");

        System.out.println(deepbutton(data,null));
    }

    //
    public static List<SkyWechatMenu> deepbutton(List<SkyWechatMenu> data, String id){
        List<SkyWechatMenu> skyWechatMenuListTmp = new ArrayList<>();
        for (SkyWechatMenu item : data) {
            String parentId = item.getParentId();
            if(id == null && parentId == null){
                item.setSubButtons(deepbutton(data, item.getId()));
                skyWechatMenuListTmp.add(item);
            }else if(parentId != null && parentId.equals(id)){
                item.setSubButtons(deepbutton(data, item.getId()));
                skyWechatMenuListTmp.add(item);
            }

        }
        return skyWechatMenuListTmp;
    }


}
