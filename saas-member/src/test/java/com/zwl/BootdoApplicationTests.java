package com.zwl;

import com.wegoo.saasservice.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootdoApplicationTests {
    @Autowired
    private UserInfoService userInfoService;


    @Test
    public void contextLoads() {
        String[] phoneList = {"18157976862",
                "15868953352",
                "18157974019",
                "13732448507",
                "19941376641",
                "18257091992",
                "15068067920",
                "13390781367",
                "13502451556",
                "18069911117",
                "13535152335",
                "18621507465",
                "15105817841",
                "18505797119",
                "18069905797",
                "13632495735",
                "15755029592",
                "18258201865",
                "18217698124",
                "15355391568",
                "13723780358",
                "15257187790",
                "15268866588",
                "18005791160",
                "13116897199",
                "15958975486",
                "15968673279",
                "13857969383",
                "18329075370",
                "13174921888",
                "18857918777",
                "13566712358",
                "15869002339",
                "15267953996",
                "17816874315",
                "18858965211",
                "15167952774",
                "18367983810",
                "18566239967",
                "13476110949",
                "13362995677",
                "13575973402",
                "15267995111",
                "17306899474",
                "13989425871",
                "13588683244",
                "13767214037",
                "15858991927",
                "15967981237",
                "18767933637",
                "17858027775",
                "13634163600",
                "17855890125",
                "13735632610",
                "18811190009",
                "13735602113",
                "18435141693",
                "18157976807",
                "15657902545",
                "18329059105",
                "18758930415",
                "18658859571",
                "18679078747",
                "13606897355",
                "17826877459",
                "13516990665",
                "13826015482",
                "18158797173",
                "15024565211",
                "18358018966",
                "15158968270",
                "13362933255",
                "17857597763",
                "18357991647",
                "18266909205",
                "13755269116",
                "15068060469",
                "18857929994",
                "15825776107",
                "13095870424",
                "17681596858",
                "13777912400",
                "18329059513",
                "15857942868",
                "18157976587",
                "18757866233",
                "18760142518",
                "15926415511",
                "18069970280",
                "18868585731",
                "15957939603",
                "17858957466",
                "17858975255",
                "18621931296",
                "13958493597",
                "18367983273",
                "15005790726",
                "13265450961",
                "13575943962",
                "18691560439",
                "18458018444",
                "13411994491",
                "18006551181",
                "17857597562",
                "15257174450",
                "15558682710",
                "15267947345",
                "15868357320",
                "16602046605",
                "15024537557",
                "13735702212",
                "15216035486",
                "13162064000",
                "15888394817",
                "13185193211",
                "18867940923",
                "17636572055",
                "18757631985",
                "13064631103",
                "18516226691",
                "15974109090",
                "15268816200",
                "15757111248",
                "13375790909",
                "18757150502",
                "18590392150",
                "13588698462",
                "15935958855",
                "15067053935",
                "18290021777",
                "18895395231",
                "13967410152",
                "18655614898",
                "13816508042",
                "18738754095",
                "13867949864",
                "18357001751",
                "13566716384",
                "18814869991",
                "18312691891",
                "15068371005",
                "13665830577",
                "13456202333",
                "13476114028",
                "18032301372",
                "15394381048",
                "15837162500",
                "18767952605",
                "18758187363",
                "18329042592",
                "15757831154",
                "13738998875",
                "18370033390",
                "15727942470",
                "18868085027",
                "17628038668",
                "18858934511",
                "17681829526",
                "13218027033",
                "18966053447",
                "15167966435",
                "18358020843",
                "15957982696",
                "14757931526",
                "13018990991",
                "13958407160",
                "13575978010",
                "15557936678",
                "13588673016",
                "13566799924",
                "13957997070",
                "15013970883",
                "18857985576",
                "15355447710",
                "18911977070",
                "17009926888",
                "18630752727",
                "18058958212",
                "15757921515",
                "13616507187",
                "18867575767",
                "18868582953",
                "13665837351",
                "18867982022",
                "13051669666",
                "15757061995",
                "15958920080",
                "18861823565",
                "18324510146",
                "15868960946",
                "18258157836",
                "15057660152",
                "13934143934",
                "15615660366",
                "15558673516",
                "15825753515",
                "15088210701",
                "13895613704",
                "15003413404",
                "13665830806",
                "18329072339",
                "18657982861",
                "18257989021",
                "15325954012",
                "15067101722",
                "13233312370",
                "13665854754"};


//        通过手机号码 查询 是否存在
//        如果存在，则更新ss_user表中的member_level=4,level_name=创业教练 ,is_buy=1,expires_time=2019-11-15 14:06:31
//        不存在,则注册
//        INSERT INTO `ss_user` (`user_id`,`wechat_openid`,`wechat_union_id`,`gzh_openid`,`merchant_id`,`register_from`,`register_mobile`,`real_name`,`logo_url`,`referrer`,`member_level`,`level_name`,`is_buy`,`expires_time`,`register_time`,`modify_time`,`available`,`gender`,`province`,`city`) VALUES ('70fcf41a83584274a12de7c3088f1a0d',NULL,NULL,NULL,'1509688041',2,'13538001080',NULL,'',NULL,4,'创业教练',1,'2019-11-15 14:06:31','2018-08-10 13:16:56','2018-10-17 17:20:30',1,NULL,NULL,NULL);


    }

    @Test
    public void test01() {
    }

}
