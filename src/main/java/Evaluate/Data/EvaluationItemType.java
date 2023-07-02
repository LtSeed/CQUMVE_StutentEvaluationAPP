package Evaluate.Data;
public enum EvaluationItemType {
    // 德育测评
    DEDUCATION_BASIC("德育基础分", "d1", 0.2),
    DEDUCATION_SCORE("德育加分", "d2", 1),
    DEDUCATION_DEDUCTION("德育扣分", "d3", -1),

    // 德育测评细化指标
    DEDUCATION_PATRIOTISM("爱国爱党，明辨是非", "d1.1", 1),
    DEDUCATION_COLLECTIVE_CONCEPT("集体观念，团结互助", "d1.2", 1),
    DEDUCATION_STUDY("勤奋学习，自觉自律", "d1.3", 1),
    DEDUCATION_DISCIPLINE("知法守法，遵守纪律", "d1.4", 1),
    DEDUCATION_CIVILITY("文明礼貌，诚实守信", "d1.5", 1),
    DEDUCATION_THRIFT("勤俭节约，自立自强", "d1.6", 1),
    DEDUCATION_PARTICIPATION("积极参加学校、学院组织的思想政治教育、法制宣传教育、安全宣传教育等德育相关主题教育活动", "d2.1", 1),
    DEDUCATION_OUTSTANDING("突出事迹加分", "d2.2", 1),
    DEDUCATION_HONOR("荣誉加分", "d2.3", 1),
    DEDUCATION_SOCIAL_WORK("社会工作加分", "d2.4", 1),
    // 智育测评
    INTELLECTUAL_ACADEMIC("学业成绩加权平均分", "z1", 0.65),
    INTELLECTUAL_TECHNOLOGY("课外科技创新加分", "z2", 1),
    INTELLECTUAL_SKILL("专业技能加分", "z3", 1),

    // 智育测评细化指标
    INTELLECTUAL_ACTIVITY("积极参加学校、学院组织的思想政治教育、法制宣传教育、安全宣传教育等德育相关主题教育活动", "z2.1", 1),
    INTELLECTUAL_ACHIEVEMENT("突出事迹加分", "z2.2", 1),
    INTELLECTUAL_HONOR("荣誉加分", "z2.3", 1),

    // 体育测评
    PHYSICAL_TEST_SCORE("体测成绩", "t1", 0.04),
    PHYSICAL_SCORE("体育加分", "t2", 1),

    // 体育测评细化指标
    PHYSICAL_EXERCISE("积极参加学校、学院组织的课外体育锻炼活动", "t2.1", 1),
    PHYSICAL_LEADERSHIP("坚持体育锻炼，积极带动同学养成体育锻炼习惯", "t2.2", 1),
    PHYSICAL_COMPETITION("体育比赛加分", "t2.3", 1),

    // 美育测评
    ARTISTIC_BASIC("美育基础分", "m1", 0.05),
    ARTISTIC_SCORE("美育加分", "m2", 1),

    // 美育测评细化指标
    ARTISTIC_PRACTICE("积极参加学校、学院开展的美育主题实践或文艺活动", "m2.1", 1),
    ARTISTIC_ORGANIZATION("积极组织美育活动", "m2.2", 1),
    ARTISTIC_COMPETITION("文艺比赛加分", "m2.3", 1),

    // 劳育测评
    LABOR_BASIC("劳育基础分", "l1", 0.05),
    LABOR_SCORE("劳育加分", "l2", 1),

    // 劳育测评细化指标
    LABOR_HYGIENE("在宿舍文明卫生检查中被评为五星级寝室或获得“卫生流动红旗”", "l2.1", 1),
    LABOR_INNOVATION("在校期间进行自主创新创业", "l2.2", 1),
    LABOR_PRACTICE("积极参加社会实践", "l2.3", 1),
    LABOR_VOLUNTEER("积极参加各类志愿服务", "l2.4", 1),
    LABOR_COMPETITION("劳育比赛加分", "l2.5", 1);

    private final String itemName;
    private final String identifier;
    private final double weight;

    EvaluationItemType(String itemName, String identifier, double weight) {
        this.itemName = itemName;
        this.identifier = identifier;
        this.weight = weight;
    }

    public String getItemName() {
        return itemName;
    }

    public String getIdentifier() {
        return identifier;
    }

    public EvaluationItemType getEvaluationItemTypeByIdentifier(String identifier) {
        for (EvaluationItemType type : EvaluationItemType.values()) {
            if (type.getIdentifier().equals(identifier)) {
                return type;
            }
        }
        return null; // 如果找不到匹配的标识符，则返回null或采取适当的处理方式
    }

    public double getWeight() {
        return weight;
    }
}
