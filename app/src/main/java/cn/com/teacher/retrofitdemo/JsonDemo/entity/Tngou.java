package cn.com.teacher.retrofitdemo.JsonDemo.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 作者：侯程月
 * 时间： 2016/12/5  10:54
 * 邮箱：437286343@qq.com
 */

public class Tngou {


    /**
     * status : true
     * total : 101254
     * tngou : [{"count":37,"description":"材料菠菜半斤，蒜苗1/2支，沙拉油2大匙，米酒1小匙，盐2/3小匙，味精少许做法1","fcount":0,"food":"菠菜,蒜苗,沙拉油,米酒,味精","id":23806,"images":"","img":"/cook/080301/d893258a7f1fb1bd6e61fbacd3e019d4.jpg","keywords":"菠菜 沙拉油 小匙 蒜苗 调味料 ","name":"炒菠菜","rcount":0},{"count":37,"description":"4、\"玛芬\"还有一种叫法是\u201c松饼\u201d，指重油重糖类的纸杯蛋糕，这种蛋糕冷藏保质期可达10天左右","fcount":0,"food":"香蕉,黄油,全蛋,香草粉,核桃,低筋粉,牛奶,红糖,小苏打,泡打粉,可可粉,肉桂粉","id":8564,"images":"","img":"/cook/150802/cea5a0d17f279a0d2ee18b2c807e8805.jpg","keywords":"香蕉 泡打粉 口感 茶匙 拌匀 ","name":"香蕉巧克力玛芬","rcount":0},{"count":37,"description":"菜谱简介做月饼馅时剩下一点熟花生米，不知应该怎样吃，放了好几天，晚上的时候终于下决心把它做出来，上网查了一下没有完全按网上的方子，就做出这样一个不太好看但特别好吃的花生米","fcount":0,"food":"花生,中筋面粉,玉米淀粉,苏打粉,糖粉,五香粉,黑胡椒","id":8565,"images":"","img":"/cook/150802/54b60bbcc4bd84599ab2cfde7e98e3c8.jpg","keywords":"花生米 面粉 茶匙 苏打粉 黑胡椒 ","name":"香酥花生豆","rcount":0},{"count":37,"description":"取锅倒入沙拉油加热，放入作法1的皇宫菜炒熟，再加入调味料炒匀即可","fcount":0,"food":"皇宫菜,沙拉油,鸡粉","id":23811,"images":"","img":"/cook/080301/23ef62d30043e8dc960cb98d625ca72d.jpg","keywords":"皇宫 沙拉油 调味料 小匙 炒熟 ","name":"炒皇宫菜","rcount":0},{"count":37,"description":"空心菜去老筋，洗净后入滚水汆烫至熟后，捞起沥干盛盘，最后再淋上作法1的蚝油酱汁即可","fcount":0,"food":"空心菜,蚝油,香油","id":23812,"images":"","img":"/cook/080301/caae5df51ba3c149f98150c1cc65cf2c.jpg","keywords":"空心菜 香油 大匙 蚝油 盐适量 ","name":"蚝油空心菜","rcount":0},{"count":37,"description":"双手沾点水搓成丸子，用油炸或者蒸熟都可以，我用的是200度烤了20分钟，锅里加玫瑰酱和清水，在根据自己的口味加些盐，将藕丸放入焖一会即可，最后还可以用水淀粉勾芡","fcount":0,"food":"藕,肉馅,料酒,蚝油,胡椒粉,玫瑰酱","id":8569,"images":"","img":"/cook/150802/94610943a07616bf6df1ecf70176655e.jpg","keywords":"适量 胡椒粉 玫瑰 甜甜蜜蜜 永结同心 ","name":"玫瑰藕丸","rcount":0},{"count":37,"description":"下雪菜和笋一起炒，炒匀入味后起锅；小诀窍最好先尝尝雪菜的咸淡，好对笋调味","fcount":0,"food":"竹笋,雪菜,大蒜,干辣椒","id":8570,"images":"","img":"/cook/150802/4090710de73d38cb8f3a944abd4e807a.jpg","keywords":"干辣椒 大蒜 切成 竹笋 碎末 ","name":"雪菜春笋","rcount":0},{"count":37,"description":"在这期间，将大葱和姜切碎，和在牛肉中，按照自己的口味添加生抽，盐，五香粉和孜然粉；3","fcount":0,"food":"低粉,酵母,牛肉馅,生抽,五香粉,孜然粉","id":8572,"images":"","img":"/cook/150802/5862c17a249b3303e15d62cf7cfc9cce.jpg","keywords":"五香粉 肉馅 面团 小匙 薄薄的 ","name":"掉渣烧饼","rcount":0},{"count":37,"description":"2、个人感觉炖汤的话，腔骨比排骨要好吃3、腔骨在煮出血水后，不要拿冷水冲，这样容易使肉表面已溢出的蛋白质凝固，如果再用冷水煮，肉里面的蛋白质就不容易炖出来了，影响汤的鲜美，而且不太容易达到脱骨的程度，吃起来口感差些","fcount":0,"food":"腔骨,藕,红枣,枸杞,八角,姜片,黄酒,咸肉","id":8576,"images":"","img":"/cook/150802/d4a3b5f6a521b0d3a8a2f05837e4ac9c.jpg","keywords":"适量 腔骨 砂锅 容易 放入 ","name":"红枣莲藕汤","rcount":0},{"count":37,"description":"材料四季豆300克，春不老咸菜15克，花生米手抓1把，八角1枚，花椒20粒，蒜1头，辣椒面15克，黄酒1汤匙，盐适量，味精适量做法1","fcount":0,"food":"四季豆,春不老,咸菜,花生米,八角,花椒,辣椒面,黄酒,味精","id":8577,"images":"","img":"/cook/150802/65f6365f90de071e04e6aaa8b8792ae4.jpg","keywords":"花生米 四季豆 花椒 不老 食物中毒 ","name":"春不老炒四季豆","rcount":0},{"count":37,"description":"p;想想自己和父亲，印象中最深的，就是坐在父亲的28自行车后面去上学，那时觉得父亲好高大，那宽厚的背像是最温暖最安全的避风港，现在父亲瘦了好多，单薄了许多，反而让我觉得，他需要我的保护和照顾了","fcount":0,"food":"鲫鱼,菠萝,圣女果,桃,番茄酱,果汁","id":8582,"images":"","img":"/cook/150802/6b43abf81e0a706223680b30ab5d8633.jpg","keywords":"父亲 番茄酱 适量 一直是 之间 ","name":"花果鲫鱼","rcount":0},{"count":37,"description":"将卤汁、水、作法1的高丽菜放入锅中煮滚，滚后再转小火煮约1小时即完成","fcount":0,"food":"高丽菜,东山鸭,卤汁","id":23864,"images":"","img":"/cook/080301/e8ca1b260e1093f0188cdc14d68d97f3.jpg","keywords":"高丽菜 卤汁 清水 洗净 材料 ","name":"卤高丽菜","rcount":0},{"count":37,"description":"将作法2的小芥菜倒掉盐水，将小芥菜搓揉均匀至软化，再挤干多余水份即可","fcount":0,"food":"小芥菜","id":23876,"images":"","img":"/cook/080301/37776dcdfd224b825eac22b495cc5344.jpg","keywords":"芥菜 放入 作法 溶解 洗净 ","name":"雪菜","rcount":0},{"count":37,"description":"再煮一锅水，等水再煮开，倒入浸好的西米，等西米煮至完全透明时，加入凉水，滚开后熄火，晾凉，放入冰箱冷藏备用","fcount":0,"food":"西米,西瓜,蜜豆,杏仁","id":8588,"images":"","img":"/cook/150802/10c79445326285f18a4e7f83719e24aa.jpg","keywords":"凉水 备用 一锅 倒入 买了 ","name":"可仁西瓜米蜜豆西米露","rcount":0},{"count":37,"description":"锅里加半锅油，黄花鱼拍干粉，下油锅炸至两面金黄，师傅还把黄花鱼复炸了一次，为了让鱼外皮完整，颜色也更加美观","fcount":0,"food":"羊肉,黄花鱼,鸡精,料酒,酱油,淀粉,香菜","id":8590,"images":"","img":"/cook/150802/e747f959b22f31834f79974c46e2dd18.jpg","keywords":"黄花鱼 锅里 羊肉 肉片 师傅 ","name":"羊肉焖黄花鱼","rcount":0},{"count":37,"description":"菜谱简介家里有瓶蚝油，买回来就没用过几次，今天用它烧个茄子试试~材料茄子，蒜头，洋葱，水，油，蚝油，剁椒酱，豆瓣酱，葱花，鸡精做法1","fcount":0,"food":"茄子,蒜头,洋葱,蚝油,剁椒酱,豆瓣酱,葱花,鸡精","id":8591,"images":"","img":"/cook/150802/e629cf06af2e8550a96fe04c4d38e091.jpg","keywords":"豆瓣酱 蚝油 洋葱 茄子 蒜头 ","name":"蚝油老酱茄子","rcount":0},{"count":37,"description":"将作法1处理好的材料加入其余材料与所有调味料一起搅拌均匀即可","fcount":0,"food":"欧芹叶,罗勒,水果醋,橄榄油,胡椒粒","id":23886,"images":"","img":"/cook/080301/7a76c7b8fd272434ffdbfaa8d6b8b428.jpg","keywords":"新鲜 材料 罗勒 水果 茶匙 ","name":"罗勒欧芹汁","rcount":0},{"count":37,"description":"取汤锅，加入高汤和作法2的丁香鱼先以大火煮至滚沸后，放入作法1的空心菜段煮约1分钟，再加入调味料拌匀即可","fcount":0,"food":"空心菜,丁香,姜丝,高汤,香油","id":23887,"images":"","img":"/cook/080301/608b582a875de0758e997e99fb27722a.jpg","keywords":"空心菜 备用 加入 香鱼 作法 ","name":"空心菜丁香汤","rcount":0},{"count":37,"description":"把所有材料洗干净，竹蔗砍成小段，对半再剖开，马蹄切去头和底部，红萝卜切成大块2","fcount":0,"food":"茅根,无花果,竹蔗,马蹄,红萝卜","id":8592,"images":"","img":"/cook/150802/35c483a07bf7d8949bdc983b984b6976.jpg","keywords":"材料 红萝卜 所有 马蹄 可以 ","name":"茅根竹蔗水","rcount":0},{"count":37,"description":"菜谱简介自从嫁给老大后，每年的三月三前天晚上我一定会接到婆婆滴电话，喊我第二天过去拿蛋吃～嘿嘿，咱南方很多地方的食俗，每年的农历三月三这天都要吃地菜籽煮蛋，不知道流行了Ｎ年了～婆婆每年都是煮这么一大锅，她说里面有四十多个蛋，咱兄弟姐妹多，大家每人来一碗就可以消灭掉～辛苦您啦～累哒恩难噶","fcount":0,"food":"地菜,黄豆,红枣,鸡蛋,鸭蛋","id":8593,"images":"","img":"/cook/150802/50d21dda05ba393cb60cc2d4d1ae4b4a.jpg","keywords":"每年 黄豆 三月 很多 鸭蛋 ","name":"三月三地菜煮鸡蛋","rcount":0}]
     */
    @SerializedName("status")
    private boolean status;
    @SerializedName("total")
    private int total;
    /**
     * count : 37
     * description : 材料菠菜半斤，蒜苗1/2支，沙拉油2大匙，米酒1小匙，盐2/3小匙，味精少许做法1
     * fcount : 0
     * food : 菠菜,蒜苗,沙拉油,米酒,味精
     * id : 23806
     * images :
     * img : /cook/080301/d893258a7f1fb1bd6e61fbacd3e019d4.jpg
     * keywords : 菠菜 沙拉油 小匙 蒜苗 调味料
     * name : 炒菠菜
     * rcount : 0
     */
    @SerializedName("tngou")
    private List<Cook> Cooks;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Cook> getCooks() {
        return Cooks;
    }

    public void setCooks(List<Cook> Cooks) {
        this.Cooks = Cooks;
    }


}
