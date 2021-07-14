package com.example.querydsl.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Reference : 대한민국 성씨 목록
 * https://ko.wikipedia.org/wiki/%EB%8C%80%ED%95%9C%EB%AF%BC%EA%B5%AD%EC%9D%98_%EC%9D%B8%EA%B5%AC%EC%88%9C_%EC%84%B1%EC%94%A8_%EB%AA%A9%EB%A1%9D
 */

enum Name {

}


enum LastName {
    // 2021. 02 기준
    FIRST_NAME("성씨", Arrays.asList("김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "오", "서", "신",
            "권", "황", "안", "송", "전", "홍", "유", "고", "문", "양", "손", "배", "조", "백", "허", "유", "남", "심", "노", "정", "하",
            "곽", "성", "차", "주", "우", "구", "신", "임", "전", "민", "유", "류", "나", "진", "지"));
    private final String lstName;
    private final List<String> lstNameList;

    LastName(String lstName, List<String> lstNameList) {
        this.lstName = lstName;
        this.lstNameList = lstNameList;
    }

    public String getLastName() {
        return lstName;
    }

    public List<String> getFirstNameList() {
        return lstNameList;
    }

//    public abstract String nameGenerator();

}


enum manName {
    MAN_NAME_LIST("남자", Arrays.asList(
            "민준", "서준", "예준", "도윤", "시우", "주원", "하준", "지호", "지후", "준서", "준우", "현우", "도현", "지훈", "건우", "우진",
            "선우", "서진", "민재", "현준", "연우", "유준", "정우", "승우", "승현", "시윤", "준혁", "은우", "지환", "승민", "지우", "유찬",
            "윤우", "민성", "준영", "시후", "진우", "지원", "수현", "재윤", "시현", "동현", "수호", "태윤", "민규", "재원", "한결", "민우",
            "재민", "은찬", "윤호", "시원", "이준", "민찬", "지안", "시온", "성민", "준호", "승준", "성현", "이안", "현서", "재현", "하율",
            "지한", "우빈", "태민", "지성", "예성", "민호", "태현", "지율", "민혁", "서우", "성준", "은호", "규민", "정민", "준", "지민",
            "윤성", "율", "윤재", "하람", "하진", "민석", "준수", "은성", "태양", "예찬", "준희", "도훈", "하민", "준성", "건", "지완",
            "현수", "승원", "강민", "정현", "우주", "태준", "승호", "주호", "성빈", "주안", "민서", "도영", "우현", "민수", "건희", "주환",
            "하랑", "다온", "정훈", "원준", "시율", "시훈", "지오", "민기", "현민", "시완", "경민", "서율", "현성", "승윤", "주영", "동하",
            "태훈", "민건", "도율", "동건", "재훈", "태영", "호준", "승빈", "가온", "재준", "시환", "세현", "태경", "이현", "도원", "도경",
            "정후", "현진", "재영", "정원", "서후", "현승", "찬영", "라온", "영준", "상현", "범준", "윤", "온유", "승훈", "성윤", "현",
            "재하", "로운", "주혁", "찬우", "이든", "연준", "하윤", "우성", "동윤", "성훈", "승재", "찬희", "지혁", "건호", "세준", "동욱",
            "태율", "수민", "태호", "유건", "승찬", "도하", "윤찬", "단우", "태우", "산", "현호", "윤후", "현빈", "시안", "찬", "재우",
            "준석", "지운", "주현", "형준", "연호", "효준", "재혁", "성우", "규빈", "주완", "주한", "동우", "하늘", "수혁", "재희", "시헌",
            "상윤", "우찬", "유빈", "진호", "유현", "석현", "우영", "준형", "도연", "윤서", "유진", "서원", "지용", "용준", "규현", "준후",
            "동준", "은율", "도준", "호진", "강현", "태인", "진혁", "상우", "우준", "은준", "승후", "시호", "지웅", "승환", "은혁", "동훈",
            "유민", "하온", "성원", "도진", "승주", "대현", "영민", "서윤", "종현", "세훈", "도겸", "서호", "현석", "신우", "재호", "준현",
            "원우", "강우", "승유", "상민", "태환", "은수", "선호", "준원", "민결", "정빈", "태오", "동혁", "영우", "아인", "유안", "동규",
            "진서", "태성", "유성", "혜성", "요한", "성진", "여준", "윤건", "인우", "태건", "주형", "우혁", "희찬", "한율", "하성", "준범",
            "찬민", "서현", "정호", "윤수", "민제", "성호", "인성", "건후", "경준", "희준", "상준", "승혁", "재이", "태원", "준민", "재율",
            "민승", "태웅", "채민", "승헌", "한울", "재성", "시준", "진영", "환희", "선율", "세윤", "호연", "승기", "세진", "성재", "태하",
            "주성", "호영", "가람", "다원", "찬율", "현규", "규원", "이한", "연후", "현욱", "준하", "시영", "희성", "정윤", "진욱", "지윤",
            "창민", "지온", "지섭", "해준", "정환", "민", "건율", "은재", "찬혁", "동연", "유하", "노아", "성찬", "세민", "서빈", "우석",
            "영훈", "도형", "준기", "윤준", "지석", "로이", "인호", "은후", "명준", "상훈", "기현", "수빈", "재형", "해성", "아준", "민후",
            "진성", "주하", "시언", "시형", "상원", "태연", "도건", "재인", "준휘", "동민", "한준", "다니엘", "기범", "주헌", "재용", "수환",
            "원", "태규", "선재", "영재", "주찬", "영진", "지수", "동호", "우재", "승범", "동원", "한별", "건영", "진", "승연", "도헌",
            "한솔", "유담", "예건", "환", "은결", "민율", "민욱", "지헌", "석준", "준모", "현재", "결", "강", "이수", "재범", "리안", "재환",
            "찬유", "호윤", "해솔", "태희", "건하", "상혁", "성욱", "동환", "영찬", "진원", "하빈", "준환", "재욱", "경훈", "준상", "서하",
            "연수", "하루", "예담", "수찬", "도균", "강준", "태이", "훈", "형우", "승규", "재빈", "도운", "종혁", "근우", "찬호", "윤혁",
            "유신", "리우", "범수", "동주", "혁준", "찬빈", "한빈", "태빈", "창현", "성주", "혁", "지현", "이찬", "유승", "겸", "은규",
            "연재", "희재", "태완", "수영", "병준", "동휘", "세영", "태욱", "의준", "관우", "성환", "재연", "재경", "민영", "윤석", "대한",
            "선준", "지유", "지욱", "은석", "성연", "경빈", "정욱", "솔", "한서", "보겸", "인준", "윤제", "도빈", "준용", "규진", "희원",
            "주언", "다율", "영광", "성하", "현중", "형진", "종윤", "채훈", "정혁", "태형", "준오", "진수", "승진", "유겸", "찬서", "종민",
            "영빈", "의찬", "한", "승하", "종우", "유환", "호성", "희수", "태헌", "채우", "재헌", "원재", "석민", "경원", "승리", "강희",
            "상욱", "민형", "범진", "민섭", "용현", "준이", "서안", "명진", "예훈", "시혁", "상진", "영현", "원석", "승수", "우민", "정연",
            "도담", "현태", "이삭", "미르", "형주", "대윤", "로하", "정인", "용우", "유호", "태균", "건민", "요셉", "기훈", "영웅", "지홍",
            "선후", "종원", "동후", "태겸", "종훈", "유한", "호", "제민", "준표", "원빈", "보성", "인서", "동희", "의진", "준규", "리한",
            "혜준", "재후", "경호", "진현", "현도", "찬솔", "호현", "다현", "동균", "원호", "재웅", "세인", "하겸", "제이", "민겸", "진석",
            "승욱", "동근", "다훈", "형민", "동영", "대호", "기윤", "기윤", "슬우", "해찬", "대영", "강윤", "진후", "정진", "서한", "동진",
            "윤상", "영서", "민균", "재승", "정준", "세찬", "규태", "민국", "우림", "경환", "우솔", "대성", "의현", "도엽", "근호", "효재",
            "다민", "효민", "민철", "예승", "준엽", "어진", "승언", "하원", "두현", "지형", "성율", "단", "채운", "진형", "대원", "시하",
            "정수", "도은", "용진", "주빈", "제현", "태진", "범서", "건형", "해인", "로건", "민교", "수인", "혁진", "슬찬", "영호", "하엘",
            "정운", "경현", "세환", "태산", "선민", "아론", "범", "준섭", "태후", "은유", "기찬", "승엽", "선규", "다빈", "기태", "태주",
            "채환", "제윤", "승완", "무진", "정재", "수안", "진규", "시유", "용재", "현웅", "윤오", "기준", "우리", "석훈", "태은", "수한",
            "석원", "다엘", "로빈", "세원", "채윤", "원진", "규연", "태혁", "재아", "필립", "한빛", "성혁", "재완", "제하", "선빈", "세빈",
            "윤기", "이레", "인혁", "주훈", "광현", "재진", "보민", "도혁", "동빈", "진하", "효성", "병찬", "성규", "채준", "승효", "시진",
            "승한", "시운", "원영", "리호", "강빈", "강호", "성운", "유석", "채호", "다겸", "종호", "채원", "이도", "범석", "현종", "성수",
            "도언", "민하", "석진", "한성", "건휘", "건욱", "상연", "믿음", "효원", "도우", "선웅", "규호", "태유", "강산", "도환", "형석",
            "선유", "정헌", "현기", "용민", "태수", "하담", "신", "희승", "무성", "용훈", "서훈", "리온", "대훈", "루이", "이환", "경태",
            "동화", "유근", "이담", "강인", "영후", "찬휘", "래원", "채현", "무빈", "민근", "희우", "하음", "민상", "윤민", "빈", "현찬",
            "경록", "휘", "찬웅", "담", "지상", "상호", "루다", "서찬", "효찬", "찬형", "하영", "영인", "희윤", "규성", "정한", "예현",
            "지효", "현율", "채완", "상빈", "사무엘", "경찬", "솔민", "태서", "서형", "동율", "재홍", "은기", "은총", "승운", "주용", "윤환",
            "서환", "용찬", "진환", "세연", "누리", "진율", "원희", "기원", "인후", "태강", "민권", "준식", "병현", "재서", "세호", "윤빈",
            "인수", "세종", "호빈", "신후", "효빈", "서인", "훤", "대연", "우형", "태용", "마루", "주윤", "수완", "보현", "경모", "영주",
            "희건", "장우", "석우", "강유", "영석", "정안", "동해", "동찬", "휘성", "규범", "영환", "호재", "선", "상헌", "유", "병훈",
            "현오", "용하", "동은", "광민", "수", "인규", "인찬", "명재", "세웅", "도한", "진모", "도완", "중현", "성은", "대경", "대환",
            "리오", "해민", "민솔", "민구", "이솔", "윤겸", "다윤", "채율", "인하", "수오", "동완", "경수", "찬욱", "태온", "리환", "태운",
            "승건", "재유", "재석", "해온", "용빈", "호민", "연성", "태한", "도후", "기주", "다인", "예강", "서혁", "홍준", "지찬", "대희",
            "강훈", "이건", "현후", "레오", "호찬", "장현", "이서", "주연", "진유", "해원", "동헌", "시찬", "성후", "종하", "제원", "근영",
            "세혁", "이루", "예한", "준명", "무경", "태랑", "시연", "진웅", "찬규", "성모", "은상", "현동", "원혁", "용호", "상후", "동엽",
            "규환", "대건", "루하", "건웅", "지빈", "해윤", "재겸", "현제", "호원", "하운", "온", "석빈", "휘준", "제우", "경진", "기환",
            "규담", "세헌", "치우", "민환", "제훈", "장원", "서온", "해담", "현식", "휘찬", "동재", "예환", "창우", "준아", "해진", "재휘",
            "준한", "이헌", "준재", "기민", "영욱", "진오", "로한", "강후", "석주", "윤형", "하승", "세율", "상율", "하울", "권", "한겸",
            "명훈", "태림", "창희", "성범", "세온", "도", "지범", "찬이"));

    private final String manName;
    private final List<String> manNameList;

    manName(String manName, List<String> manNameList) {
        this.manName = manName;
        this.manNameList = manNameList;
    }

    public List<String> getManNameList() {
        return manNameList;
    }
}


enum womanName {
    // 2021. 02. 기준 1~1000.
    WOMAN_NAME_LIST("여자 이름", Arrays.asList(
            "서연", "서윤", "지우", "서현", "민서", "하은", "하윤", "윤서", "지유", "지민", "채원", "지윤", "은서", "수아", "다은", "예은",
            "지아", "수빈", "소율", "예린", "예원", "지원", "소윤", "지안", "하린", "시은", "유진", "채은", "윤아", "유나", "가은", "서영",
            "민지", "예진", "서아", "수민", "수연", "연우", "예나", "예서", "주아", "시연", "연서", "하율", "다인", "다연", "시아", "아인",
            "현서", "서은", "유주", "아린", "서우", "하연", "서율", "서진", "채윤", "유빈", "지율", "나윤", "수현", "예지", "다현", "소은",
            "나은", "나연", "지은", "민주", "아윤", "사랑", "시현", "예빈", "윤지", "서하", "지현", "소연", "혜원", "지수", "은채", "주하",
            "채아", "승아", "다윤", "소민", "서희", "나현", "민아", "채린", "하영", "세아", "세은", "도연", "규리", "아영", "다온", "가윤",
            "지연", "예림", "태희", "민채", "주은", "시윤", "유정", "연아", "소현", "아현", "보민", "민정", "수진", "현지", "민경", "정원",
            "나경", "가현", "세연", "은지", "윤하", "가연", "지효", "가온", "라희", "예슬", "채연", "한별", "현아", "하늘", "소희", "효주",
            "유림", "유하", "채민", "은솔", "봄", "주연", "가영", "예주", "소이", "유리", "혜린", "하진", "다희", "하랑", "하나", "태연",
            "설아", "윤슬", "은우", "하람", "다혜", "다솜", "혜인", "지혜", "유민", "재인", "승연", "다빈", "수인", "재이", "지영", "수정",
            "리아", "시온", "은유", "채영", "주원", "고은", "태린", "태은", "지후", "아라", "민하", "나영", "수지", "소영", "단아", "은별",
            "서인", "보경", "다영", "주희", "가빈", "채현", "정민", "예솔", "시우", "효린", "지온", "정윤", "소정", "라온", "은재", "세빈",
            "한나", "연재", "채이", "서빈", "예담", "슬아", "아진", "해인", "아연", "연주", "도희", "보미", "예인", "지호", "나율", "서정",
            "다원", "하음", "정연", "별", "은빈", "다율", "서원", "율", "세인", "효은", "연지", "준희", "재희", "채희", "지인", "도은",
            "은비", "다경", "리원", "채빈", "소미", "희원", "가인", "윤주", "유은", "혜민", "미소", "루아", "솔", "은수", "혜진", "은율",
            "세린", "이안", "리안", "은혜", "연수", "재은", "설", "하민", "아름", "로아", "유라", "효원", "라윤", "현진", "유이", "민영",
            "이현", "선우", "혜빈", "단비", "하온", "정현", "혜윤", "온유", "윤", "세영", "정은", "제인", "여진", "채율", "가을", "민솔",
            "윤진", "라엘", "은성", "세희", "유경", "여원", "현정", "서린", "가람", "주현", "윤채", "소원", "진서", "나린", "은설", "현주",
            "도경", "하엘", "연희", "해나", "혜림", "효민", "진아", "다정", "주영", "가희", "제이", "혜리", "라임", "소담", "하빈", "규빈",
            "지예", "지희", "태리", "수영", "효빈", "희주", "다예", "시원", "아림", "리나", "려원", "승희", "은진", "가율", "시율", "하정",
            "혜주", "시영", "윤희", "효정", "다민", "하리", "이나", "이솔", "선아", "나희", "해솔", "은아", "희진", "효진", "정인", "하경",
            "윤정", "성은", "승현", "규린", "윤솔", "영은", "새봄", "유안", "지오", "송현", "해린", "재아", "소유", "은영", "선유", "영서",
            "인서", "보영", "아율", "서이", "규림", "태이", "민선", "은하", "민희", "아정", "하임", "이서", "세현", "우리", "도윤", "도아",
            "아란", "승주", "혜나", "효림", "별하", "가원", "선영", "하늬", "수린", "예온", "예리", "시하", "담희", "도영", "희수", "정아",
            "다솔", "루리", "선율", "희연", "라은", "한비", "은정", "희서", "송연", "해원", "예람", "이수", "시안", "서경", "혜연", "라율",
            "리하", "은", "하원", "지나", "다해", "유미", "린", "유현", "예랑", "아람", "은주", "윤영", "하루", "빛나", "여은", "우주",
            "세령", "경민", "하라", "세진", "예령", "예영", "혜정", "예윤", "진", "수안", "로하", "진희", "초아", "나예", "수하", "수경",
            "누리", "아리", "진주", "인아", "태경", "민진", "나원", "윤설", "민", "보현", "인영", "이레", "하선", "성연", "승은", "태인",
            "정빈", "예현", "다미", "경은", "연진", "유담", "해윤", "나래", "희정", "소예", "규원", "가민", "한솔", "서안", "여울", "세하",
            "희윤", "여름", "도이", "다겸", "율아", "채하", "규민", "로희", "이진", "세나", "아민", "서유", "나라", "혜은", "시유", "재연",
            "세윤", "지선", "세라", "하이", "해리", "슬", "안나", "채령", "혜영", "재윤", "미나", "루다", "현", "주혜", "태림", "루나",
            "연후", "민설", "린아", "혜령", "보윤", "진영", "에스더", "초은", "슬기", "세림", "보람", "유희", "예봄", "성아", "기쁨", "채림",
            "시언", "송이", "다나", "미주", "윤경", "로운", "은송", "보라", "지애", "설하", "승하", "리우", "사라", "도현", "현경", "설희",
            "영주", "민재", "로은", "효인", "주빈", "보빈", "소망", "예승", "주이", "세민", "예음", "아랑", "나혜", "라원", "은결", "이은",
            "샛별", "혜지", "소진", "예하", "민유", "한결", "태영", "서후", "하림", "은경", "연두", "선민", "보연", "율희", "유솔", "은희",
            "연정", "제니", "규연", "율하", "세이", "라현", "은호", "고운", "예안", "희선", "은교", "보은", "율리", "세정", "가령", "재원",
            "호연", "송희", "나림", "영채", "제나", "지언", "희은", "시호", "승민", "예율", "채안", "서온", "현희", "민교", "지빈", "재영",
            "하현", "선하", "효리", "주윤", "도담", "재경", "강희", "세경", "세경", "수희", "선주", "소빈", "우림", "해온", "이엘", "루하",
            "세원", "조이", "주미", "희영", "연경", "민혜", "미래", "승혜", "은선", "희재", "제아", "경빈", "혜선", "미진", "윤선", "민송",
            "유선", "채경", "성현", "주안", "나엘", "근영", "인혜", "보아", "예성", "수미", "로이", "하령", "현영", "세미", "이랑", "희",
            "혜율", "다엘", "도원", "이담", "호정", "한서", "태윤", "경원", "새론", "려은", "성희", "아은", "도하", "윤빈", "해민", "다애",
            "서주", "보배", "윤우", "소을", "선미", "미정", "혜수", "준서", "애린", "선혜", "소울", "나리", "유아", "혜미", "지이", "선",
            "윤이", "레아", "예희", "민소", "연", "선희", "정희", "샤론", "이정", "세온", "리온", "연화", "슬비", "정음", "초원", "가림",
            "예소", "새별", "수윤", "루비", "담이", "솔희", "유연", "채리", "진솔", "나겸", "시후", "나온", "솔비", "혜성", "서령", "규나",
            "정하", "효연", "유린", "어진", "루미", "리윤", "유지", "혜승", "건희", "단희", "금비", "이슬", "보나", "이든", "선빈", "연하",
            "윤비", "신비", "영인", "루희", "효경", "규은", "이설", "정안", "정서", "지음", "한슬", "리예", "설현", "은후", "초희", "서형",
            "소리", "은세", "예솜", "신영", "진하", "혜서", "효서", "지서", "찬희", "채유", "조은", "미경", "원희", "리현", "단", "솔빈",
            "다운", "수림", "솔민", "유영", "해빈", "우정", "해진", "이지", "승미", "아빈", "선경", "하솜", "의진", "현채", "환희", "주리",
            "경서", "원", "혜경", "효재", "빈", "해림", "솜", "은효", "예준", "가경", "우진", "소라", "봄이", "선화", "은미", "윤성",
            "채인", "세리", "진경", "신혜", "채언", "여정", "한빛", "라연", "다흰", "푸름", "승유", "희경", "화영", "서림", "상은", "해주",
            "해주", "상아", "연제", "예선", "은민", "수예", "소혜", "지운", "희우", "승빈", "민성", "나나", "은총", "성주", "담", "리사",
            "태현", "승원", "하담", "결", "주예", "다슬", "주언", "예송", "그린", "솔지", "윤재", "규희", "현수", "경아", "소린", "찬미",
            "하니", "유원", "단하", "미연", "송하", "초연", "엘리", "현선", "단우", "지솔", "아원", "유비", "래아", "솔아", "채우", "혜준",
            "은조", "애리", "한울", "규아", "규비", "승리", "현민", "성윤", "하얀", "미영", "연호", "제희", "현이", "동희", "승윤", "미서",
            "민슬", "수은", "진이", "영지", "수애", "현비", "진유", "윤혜", "영아", "하솔", "인하", "유화", "미현", "경희", "예경", "수",
            "한율", "해연", "조안", "새롬", "미선", "이린", "해율", "규미", "비", "마리", "자윤", "혜온", "율이", "초이", "은제", "우빈",
            "다올", "성경", "바다", "승지", "세율", "이주", "준영", "미우", "해슬", "해담", "가린", "인경", "레나", "하유", "원영", "벼리",
            "정화", "소명", "래은", "솔이", "인애", "명주", "유니", "유", "비주", "루빈", "설리", "희나", "자은", "담비", "명지", "해은",
            "소운", "희지", "다유", "리유", "은찬", "경진", "보겸", "경미", "이룸", "혜담", "예닮", "아이린", "서혜", "여경", "준이", "효선",
            "솔미", "미지", "예정", "새나", "지향", "보리", "서휘", "명진", "도혜", "준아", "린하", "이음", "이솜", "상희", "자인", "소하",
            "명서", "여빈", "지해", "해랑", "송아", "윤미", "한희", "유란", "혜솔", "노을", "도예", "한아", "자영", "우영", "우경", "재나",
            "송은", "재린", "영선", "채정", "설화", "이재", "아미", "다진", "성민", "은빛", "나빈", "설린", "자연", "나령", "미유", "수련",
            "효담", "예본", "효영", "세화", "승효", "수화", "우희", "리엘", "정빈", "예현", "다미", "경은", "연진", "유담", "해윤", "나래",
            "희정", "소예", "규원", "가민", "한솔", "서안", "여울", "세하", "희윤", "여름", "도이", "다겸", "율아", "채하", "규민", "로희",
            "이진", "세나", "아민", "서유", "나라", "혜은", "시유", "재연", "세윤", "지선", "세라", "하이", "해리", "슬", "안나", "채령",
            "혜영", "재윤", "미나", "루다", "현", "주혜", "태림", "루나", "연후", "민설", "린아", "혜령", "보윤", "진영", "에스더", "초은",
            "슬기", "세림", "보람", "유희", "예봄", "성아", "기쁨", "채림", "시언", "송이", "다나", "미주", "윤경", "로운", "은송", "보라",
            "지애", "설하", "승하", "리우", "사라", "도현", "현경", "설희", "영주", "민재", "로은", "효인", "주빈", "보빈", "소망", "예승",
            "주이", "세민", "예음", "아랑", "나혜", "라원", "은결", "이은", "샛별", "혜지", "소진", "예하", "민유", "한결", "태영", "서후",
            "하림", "은경", "연두", "선민", "보연", "율희", "유솔", "은희", "연정", "제니", "규연", "율하", "세이", "라현", "은호", "고운",
            "예안", "희선", "은교", "보은", "율리", "세정", "가령", "재원", "호연", "송희", "나림", "영채", "제나", "지언", "희은", "시호",
            "승민", "예율", "채안", "서온", "현희", "민교", "지빈", "재영", "하현", "선하", "효리", "주윤", "도담", "재경", "강희", "세경",
            "세경", "수희", "선주", "소빈", "우림", "해온", "이엘", "루하", "세원", "조이", "주미", "희영", "연경", "민혜", "미래", "승혜",
            "은선", "희재", "제아", "경빈", "혜선", "미진", "윤선", "민송", "유선", "채경", "성현", "주안", "나엘", "근영", "인혜", "보아",
            "예성", "수미", "로이", "하령", "현영", "세미", "이랑", "희", "혜율", "다엘", "도원", "이담", "호정", "한서", "태윤", "경원",
            "새론", "려은", "성희", "아은", "도하", "윤빈", "해민", "다애", "서주", "보배", "윤우", "소을", "선미", "미정", "혜수", "준서",
            "애린", "선혜", "소울", "나리", "유아", "혜미", "지이", "선", "윤이", "레아", "예희", "민소", "연", "선희", "정희", "샤론",
            "이정", "세온", "리온", "연화", "슬비", "정음", "초원", "가림", "예소", "새별", "수윤", "루비", "담이", "솔희", "유연", "채리",
            "진솔", "나겸", "시후", "나온", "솔비", "혜성", "서령", "규나", "정하", "효연", "유린", "어진", "루미", "리윤", "유지", "혜승",
            "건희", "단희", "금비", "이슬", "보나", "이든", "선빈", "연하", "윤비", "신비", "영인", "루희", "효경", "규은", "이설", "정안",
            "정서", "지음", "한슬", "리예", "설현", "은후", "초희", "서형", "소리", "은세", "예솜", "신영", "진하", "혜서", "효서", "지서",
            "찬희", "채유", "조은", "미경", "원희", "리현", "단", "솔빈", "다운", "수림", "솔민", "유영", "해빈", "우정", "해진", "이지",
            "승미", "아빈", "선경", "하솜", "의진", "현채", "환희", "주리", "경서", "원", "혜경", "효재", "빈", "해림", "솜", "은효", "예준",
            "가경", "우진", "소라", "봄이", "선화", "은미", "윤성", "채인", "세리", "진경", "신혜", "채언", "여정", "한빛", "라연", "다흰",
            "푸름", "승유", "희경", "화영", "서림", "상은", "해주", "해주", "상아", "연제", "예선", "은민", "수예", "소혜", "지운", "희우",
            "승빈", "민성", "나나", "은총", "성주", "담", "리사", "태현", "승원", "하담", "결", "주예", "다슬", "주언", "예송", "그린",
            "솔지", "윤재", "규희", "현수", "경아", "소린", "찬미", "하니", "유원", "단하", "미연", "송하", "초연", "엘리", "현선", "단우",
            "지솔", "아원", "유비", "래아", "솔아", "채우", "혜준", "은조", "애리", "한울", "규아", "규비", "승리", "현민", "성윤", "하얀",
            "미영", "연호", "제희", "현이", "동희", "승윤", "미서", "민슬", "수은", "진이", "영지", "수애", "현비", "진유", "윤혜", "영아",
            "하솔", "인하", "유화", "미현", "경희", "예경", "수", "한율", "해연", "조안", "새롬", "미선", "이린", "해율", "규미", "비",
            "마리", "자윤", "혜온", "율이", "초이", "은제", "우빈", "다올", "성경", "바다", "승지", "세율", "이주", "준영", "미우", "해슬",
            "해담", "가린", "인경", "레나", "하유", "원영", "벼리", "정화", "소명", "래은", "솔이", "인애", "명주", "유니", "유", "비주",
            "루빈", "설리", "희나", "자은", "담비", "명지", "해은", "소운", "희지", "다유", "리유", "은찬", "경진", "보겸", "경미", "이룸",
            "혜담", "예닮", "아이린", "서혜", "여경", "준이", "효선", "솔미", "미지", "예정", "새나", "지향", "보리", "서휘", "명진", "도혜",
            "준아", "린하", "이음", "이솜", "상희", "자인", "소하", "명서", "여빈", "지해", "해랑", "송아", "윤미", "한희", "유란", "혜솔",
            "노을", "도예", "한아", "자영", "우영", "우경", "재나", "송은", "재린", "영선", "채정", "설화", "이재", "아미", "다진", "성민",
            "은빛", "나빈", "설린", "자연", "나령", "미유", "수련", "효담", "예본", "효영", "세화", "승효", "수화", "우희", "리엘"));

    private final String womanName;
    private final List<String> womanList;

    womanName(String womanName, List<String> womanList) {
        this.womanName = womanName;
        this.womanList = womanList;
    }

    public String getWomanName() {
        return womanName;
    }

    public List<String> getWomanList() {
        return womanList;
    }
}


public class NameGenerator {
    public String randomSelectFirstName() {
        List<String> firstnameList = LastName.FIRST_NAME.getFirstNameList();
        Collections.shuffle(firstnameList);
        return firstnameList.get(0);
    }

    public String randomSelectManName() {
        List<String> manNameList = manName.MAN_NAME_LIST.getManNameList();
        Collections.shuffle(manNameList);
        return manNameList.get(0);
    }

    public String randomSelectWomanName() {
        List<String> womanList = womanName.WOMAN_NAME_LIST.getWomanList();
        Collections.shuffle(womanList);
        return womanList.get(0);
    }


    public String mannameGenerator(){
        return randomSelectFirstName()+randomSelectManName();
    }
    public String womannameGenerator(){
        return randomSelectFirstName()+randomSelectWomanName();
    }

}
