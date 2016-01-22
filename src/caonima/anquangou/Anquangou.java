package caonima.anquangou;


import static caonima.anquangou.MD5Encrypt.MD5Encode;

public class Anquangou {

    public static void main(String[] args) {

        String url = "http://apis.baidu.com/apistore/weatherservice/weather?apikey=1e08b47bc5fc83bccc9b6bfb3b4cf1df&citypinyin=hangzhou";
        //用fiddler抓包把请求放到github,这下他们的app肯定会出现重大安全风险!!!安全的傻逼是这么认为的

        String xiangkungou ="apikey=647841f58654f812fbe8a1484c425e78";
        String wangleigou ="apikey=ba05531f51425e1b895ce2982784bef9";
        String xianggou1 ="apikey=dfa0bda6c6daa56e6975016e9180b635";
        String xianggou12 ="apikey=f9f2fdd8eb9d2a384d90be23c4368926";
        String xianggou2 ="apisign=baf3be582a467e7fa564d50d70c116aa";
        String xianggou3 ="apisign=7a0fba4347d2d0cafa54dd463cd84561";
        String xianggou4 ="apisign=24416be6a0927de50cf107692d0eab49";
        String xianggou42 ="apisign=5a3f1e8676112f38f1e0f31c8351b53b";



        System.out.println();
        System.out.println(MD5Encode("caonima的安全部门"));
        System.out.println(MD5Encode("caonima的这是规定"));
        System.out.println(MD5Encode("caonima的二级违规"));
        System.out.println(MD5Encode("caonima的重大影响"));
        System.out.println(MD5Encode("caonima的敏感信息能随便抓包?"));
        System.out.println(MD5Encode("caonima的安全专家吃饱撑着什么是安全和危险的数据都分不清"));
        System.out.println(MD5Encode("caonima的故意上传"));
        System.out.println(MD5Encode("caonima的恶意夸大事实怒刷存在感的安全狗!!!"));
        //System.out.println(MD5Encode("caonima的安全狗不得好死"));
    }
}
