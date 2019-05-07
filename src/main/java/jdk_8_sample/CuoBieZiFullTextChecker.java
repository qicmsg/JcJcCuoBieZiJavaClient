package jdk_8_sample;


import com.alibaba.fastjson.JSONObject;
import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class CuoBieZiFullTextChecker {
    public static void main(String[] args) {
        CuoBieZiFullTextChecker one_obj = new CuoBieZiFullTextChecker();
        String url = "http://api.CuoBieZi.net/spellcheck/chinese/html_result";

        url = "http://"+comm_consts.APIHost+"/spellcheck/chinese/html_result";


        String sentence = "感冒药不能根治感冒，感冒药的价值是什么呢？";

        sentence = "感冒药不能根治感冒，感冒药的价值是什么呢？ 重构零售消费场景，打造智能未来主题：《新零售大数据+人工智能产业促进中心揭牌仪式暨“重构零售消费场景，打造智能未来”》时间：2018年05月08日地点：上海四行仓库           主持人：    尊敬的各位领导，各位来宾，大家下午好！    欢迎大家与我共同欣赏今天的《新零售+人工智能产业促进中心揭牌仪式“重构零售消费场景，打造智能未来”》。    感谢本次活动的支持媒体，感谢各位媒体的朋友的支持，接下来以热烈的掌声，欢迎揭牌仪式的各位领导。    为相应国家大数据的战略，和大数据综合实验区建设，围绕上海大数据维一体的战略，打造科技创新周期，百联集团旗下和上海大数据联盟发起创立了新零售大株距加人工智能产业中心，今天我们工具一起。接下来以热烈的长生，欢迎马慧民博士为我们做产业促进中心的介绍。           马慧民：    谢谢各位领导，我们大数据界的同行，这里简单介绍一下。    我们新零售大数据促进中心，大数据+人工智能已经成为产业发展的趋势，我们上海比较有名的做人工智能的专家，我们前段时间聊天的时候，在那个时代，他学自动控制和人工智能是被鄙视的，你是学人工智能的，他恢复人家你才是学人工智能的。现在他被推到这么风口，成为时代的趋势，这部分的人工智能由数据的。第二个时代背景我们上海的大数据在在布局之下，在2016年推出了上海大数据发展战略，同时又是国家大数据示范综合实验区，上海的大数据和人工智能进行新一轮的发展，今天的静安区2017年成为国家大数据综合示范城区的试点单位，综合治理，很多部分都是大数据产业的大布局，这里很多的发展。第三块，新零售将成为大数据和人工智能重要的应用场景，这里用一个例子跟大家分享一下，这个例子各位也应该听到过，去年的时候，大润发的董事长，他说了一句，他赢了所有的对手，却输给了这个时代。但是他却往往输给了新零售的时代，新零售的时代有技术和资本的推动，所以阿里入驻了大润发。我们种格中心将由百联商业互联网科创中心，上海大数据的联合创办。百联商业互联网科创中心立足于新零售产业，依托百联集团全客群全渠道，全业态，全品类的平台，与创业企业，创客共同开展前瞻性技术应用研究，联合推进新技术，新运营，新模式新体验创新，欢迎在新零售，大健康领域的优秀创业企业，创客入驻百联创业空间，共建商业互联网创新生态。我们有理由相信百联比其它互联网行业做的更好，我们大数据联盟在上海经信委和科委一个行业组织，依托单位，是上海超级计算中心和上海产业技术研究院，超过600多家会员单位，涵盖了大数据资源，技术和应用整个产业链，涉及金融医疗交通旅游能源零售等各个的大数据垂直应用领域。我们功能定位，传播、智库+资本。我们传播的呢魔方大数据行业应用系统论坛，中国大数据产业创新峰会，BOT大数据人工智能技术创新大赛。智库我们有一个观察，还有大数据企业评估。大数据联盟成为十大最具影响力大数据社会智库。这个产业促进中心，我们目标大概由5个方面的工作，第一个方面做好研究咨询的工作，面向我们主管部门开展政策法规的研究，面向新零售领域，在行业组织大数据也好，数据智能也好，通信也好，都有自己的标准和规范，协助静安区推动的大数据企业评估都属于法律规范的一些推动。达二个行业交流，面向新零售产业链内各企业开展对外合作交流工作，第三个工作，有一些项目的发布，整合百联等新零售大龙头企业的技术需求，面向伙伴发布合作项目。第四个方面，我们做双创合作，相应国家的号召，把全球的优秀企业项目招募到孵化器当中，今天的在坐看到的百联在四行仓库的孵化器。最后一项做人才培训，依托我们大数据联盟的资源开展一些人才培训和服务。今年的话我们做短期的规划，第一项我们跟中国铁道出版社，做人工智能系列从书，第二个联合主办BOT大赛及以新零售应用做主题，包括领域的新的一些企业，包括联通几家公司共同参与这个大赛，在5月底发布这个赛体，大赛的将近还是一如既往的不错，有兴趣的可以多参与。第三项工作，百联在我们产业促进中心发布一批新零售的技术研究和应用创新的合作项目，包括比较火的无人门店的技术，还有O2O的应用，当然地四项工作，共同的依托大数据联盟，包括超算的资源。这个平台有计算资源有数据资源，还有大量的微服务的资源，以后编重新非常荣新。最后一个我们组织大量的培训会。期待各位的加入，到促进中心来，打造新零售的未来，谢谢大家。           主持人：    感谢马博士为促进中心做的介绍。促进中心的成立体现百联集团打造商业互联网的科创中心建立大数据人工智能在零售行业的交流合作高低的重大决心，接下来有请上海张英女士，为活动致辞，大家掌声欢迎。           张英：    尊敬的徐总裁，周主任，沈总，各位来宾大家下午好，非常高兴参加今天的新零售大数据和人工智能产业促进中心的揭牌仪式，以及新零售相关的论坛，代表上海经信委，和大数据联盟联合成立的中心表示热烈的祝贺对长期关心关注大数据发展，知会城市建设的各界人士表示感谢。强大的渗透里和融合里，推动我们新业态新模式的发展，以前所未有的速度，带来我们现实生产力的提升，引领科技、经济、社会的日新月异的发展，作为我们下一步建设卓越的全球城市，按照国家战略我们全面推动大数据云计算，人工智能的发展，在坐的都很熟悉，我们发布大数据的实施意见人工智能的实施意见，最近我们也在实施智能上海的行动。这一切都是为了进一步推动培训新经济和新动能，目前全市的大数据企业将近700家，加盟大数据联盟也有500多家，覆盖技术、应用服务产业和林领域，大量推动新兴行业在城市管理和民生服务，商业环境营造的领域的应用。也形成了一批具有国际水品的产品和示范应用的项目，最近我们也在大力的进一步推动政府数据的开放以及公共数据的共享开放，我们下一步探索一些创新模式，持续向社会释放数据红利，促进全社会的创新和创业，新一代信息技术的快速渗透下面，以无人超市、无人便利店新零售形态进一步涌现。促使线上线下体验以及新一代物流的方面融合，驱动下的产业变改进一步带来快速的变化。百联几天在徐总裁的带领下面，新零售领域当中不断的进行探索，特别是利用互联网大数据产业集团的发展，产业的转型方面做了大量的探索性工作，在百联集团大力支持下面，百联互联网创客中心与联盟一起创立了产业促进中心。刚才博士业介绍了我们促进中心下一步工作的考虑，也是大力的支持，希望能够创新的建立像这种的微实验室也是上海的一种探索，把我们更多的社会的公共数据能够更好的用于开放用于全社会的创新创业，利用这次机会，进一步的迎接挑战，推动我们资源的整合开放，探索业务模式的创新，打造更多的示范应用，强占新零售时代发展的战略新高低，为打造上海的购物时代品牌作出更大的贡献。最后祝愿本次论坛活动圆满成功，谢谢。           主持人：    谢谢张总工程师的讲话，非常感谢上海静音为对我们的大力支持。接下来有请，徐子瑛女士做活动致辞。           徐子瑛：    尊敬的经信委、张总、沈总、周逐日静安区的各位领导和大家下午好，非常感谢大家百忙之中，参加我们今天的仪式和活动，再次还是感谢经信委和相关部门对百联集团的支持和帮助，特别是把重要的非常领先的全球的这样一个创新的方向，能够和百联集团共同的进步推动这样的一个领域，帮助我们共同成长和发展。百联集团以实体零售为主的企业，过去几年里不断的创新和变革，全球的商业领域都经历着快速的变革，从人类5000多年的历史来看颠覆性的变革，最剧烈，也是最深刻的一次，影响全球商业的格局和未来的发展，过去几年我们倾入很多的力量，一方面零售终端的门店的创新变革，一方面是新技术，特别是互联网技术改造和特生新零售，这方面工作，整个非常重要的工作，一方面积极探索线上领域，互联网的技术，实现我们转型和发展，与此同时我们也在想这个企业转型和创新，借助自己的原有的力量远远不够，我们人力资源，原来的发展组织，和体系结构基于线下的实体机构，无论百货公司、公务中心、便利以及标准化的产品，在不同的细分领域自身的优势，我们转型互联网企业的时候突然发展组织架构决策模式，投入模式，以及人力资源的基础和过去以来的基础不一样，集团在过去5年里面做了大量的实践和探索，我们今天在四行仓库我们刚刚落成的中心，当前世界的科技创新是开放性的创新，任何一个国家和地区，都基于开放性的创新得以未来的创新和发展，在百联企业历史悠久的四行仓库拿出来整体打造，我们拿出来为全社会共同孵化创新企业和团队，我们在的地区和环境，本质上是我们非常市中心很好的位置拿出来，用于全社会科技创新的领域的孵化，一方面给量良好的空间，我们是商业企业我们应用这些科技的成果，在应用层面与我们需求出发，共同推进商业互联网科技当中的创新，所以在去年的话我们和张江地区共同组建和天使基金，希望通过天使基金的话，早期的是孵化投资一批科技创新的企业，入驻企业的企业特别关注，昨天为止科技型的企业接近40家左右，更多的企业也会逐步进入我们的平台。有天使基金还不够，我们马上还要设立科创基金，更加鼓励创新的技术在产业发展当中有帮助，基金设立和市场的基金共同对接培育和发展，在企业同时，营造一个良好的促进商业科技的团队和发展的基础。在我们这个过程当中我们感觉到当今互联网的技术，它所带来的无论是人工智能大数据的，区块链相关一系列的技术深刻影响我们商业格局的变化，虽然我们过去几年搭建了平台，也是得到更方面的关注，我们感觉到，我们有一些数据的积累，如何开发应用发觉这些大数据成为精准经营和营销，服务消费者的模式，不断改善现有的工作，我们已经有了启发，但是我们觉得远远不够，从企业自身来讲有很多的需求，借助技术的力量不断的帮助我们成长和转变。    所以，这方面我们过去几年当中，非常关注，希望这样的促进中心的成立，立足智能加创新的环境下，治理于发展。不断追踪商业应用前景，在创新发展的领域，在中心的平台和更多的社会资源和科创基金和高效的科研机构团队进一步核心技术里面的合作。研究发展领域不断提升在这些领域的应用和发展的研究水平，打造研发新的高低。总而言之，企业自身来讲有强烈的业务发展需求，相关部门也我们相关的支持，我们希望加快发展，为上海和国家的商业零售的新技术成长做出我们积极的贡献，帮助我们企业更快的成长，谢谢大家。           主持人：    非常感谢徐总裁的致辞，感谢领导的科创中心的厚望。接下来进入揭牌仪式及首批促进中心合作伙伴发布。    非常各位领导和合作伙伴的支持，接下来进入我们今天的主题演讲环节，我们第一个演讲的嘉宾是彭巍先生，大家欢迎。           彭巍：    各位领导、各位来宾，大家下午好！利用这个难得的机会，在这里与各位简单报告一下百联科创中心在新零售应用创新方面的一些思考！百联集团早在2014年底即已提出商务电子化，即全渠道战略；百联的新零售平台是在2016年的519正式上线运营，转眼就是两年；为持续助力传统零售的转型与升级，百联于2016年3月底正式提出，希望通过技术与应用创新，充分借助社会化的创新力量，一起推动商业互联网生态的构建，于是在四行仓库这个非常有纪念意义的历史建筑，正式成立了百联商业互联网科创中心，该中心于2017年8月底正式运营。援引阿里研究院关于新零售创新驱动力及发展方向的一些观点，在这里与大家分享一下。技术发展带来零售业的变革，我们所讲的互联网技术，包括云计算、IoT、大数据、人工智能等技术，也包括线下门店应用的各种技术，持续推动了零售业的改变，最关键是通过技术推动了零售基础设施的变化，变成了一些数据，这些数据反过来重新改变零售业的模式。首先，中国的数字化进程已在全球领先，新零售创新的三大驱动力是新技术、消费升级、零售企业转型；每个人手中的手机不再是简单的消费品，所有智能终端都是商业基础设施的一部分，这些商业基础设施变成百货、超市门店的前台，整个零售业的基础设施发生了重大的变化；互联网技术把商业数据集合体变成了底座，而这个底座进一步沉淀出各种各样数据的洞察和信用体系，推动整个零售业发生变革，今天的新零售构建在新的商业基础设施之上。新零售有一个基本的框架，最基础的后台是全渠道平台的基础设施；会员、营销、商品供应链、支付、订单、客服等构成了中台，今天全渠道模式把中台进一步打穿，用API接口连接起来，共享数据，进一步形成标准化的平台；消费者、消费场景、商品供应链都发生了变革；不管是前台、中台、后台，都在发生完整意义上的全生态重构；从前台来看人货场，首先是“人”发生了变化，已经不是单纯意义上的“人”，而是数字化的消费者，在不同的场景下把生产、销售和消费全部贯通，直接C2B，即深度定制，形成一个新的业态；手机端变成“场”，实体店变成“场”，各种可能接触消费者的地方都变成了“场”，从零售业的角度来讲是全渠道，从消费者来看，可以在任何地方、任何时间能够跟商品和商家互动，形成具体的消费场景。其次，新零售未来发展有三大趋势。第一大趋势，新零售推动实体门店的体验升级，升级的趋势不是简单的线上与线下的组合，而是实体门店与数字门店的无缝融合，把大的全渠道平台体系跟实体门店IT体系打穿，这就是我们讲的全渠道门店；第二大趋势，数字化程度向产业上游渗透、推动商品供应链的变革，生产制造变成了互联网制造，网红、内容、IP等变成了连接生产和消费的连接器，基于互联网数据动态变化机制，形成一个新的供应链生产制造模式；第三大趋势，新零售服务商将大量涌现，如供应链服务、内容服务、门店服务、金融服务等服务商进一步进入市场，形成了新的零售业变革的动力。一个依托在大数据的基础上形成的新的数字零售正在成长、发展；同时，技术设备的成本在大幅下降，数字技术、存储技术、计算技术进一步普及，一定会对新零售的发展带来巨大的推动和变革。我们再来看一下阿里、腾讯、京东等互联网巨头在新零售创新方面作的一些尝试；阿里新零售于2016年10月正式提出；智慧门店解决方案是新零售线上线下一体化中非常重要的一环，其重点在于打通线下门店与线上平台间的数据连接；基于物联网技术，通过店内智能硬件建立与消费者之间的触点，增强用户体验，实现门店数字化、消费需求的场景化；重点看一下淘宝会员店，包括三大核心应用，一是自主感知及学习系统，通过多路摄像头和多传感器融合的技术，在非配合情景下，实现生物特征识别真实的人，识别用户针对不同商品的购物情绪，了解用户反馈，进一步优化商品的结构与商品的陈列，逐渐打造用户“自己的店”；二是目标跟踪及分析系统，基于实体零售行业IoT解决方案，支持阿里大电商在会员、营销、商品供应链等体系更方便的赋能线下，同时线下实体的数据更高效的融合到阿里的大数据平台，形成闭环，目前主要是店内数据分析，比如消费者的移动轨迹、选购时心情，店内货架的实时库存、拿起及放下等访问情况；三是意图识别及交易系统，通过视频分析、生物特征识别和商品等物体检测与跟踪，精准判断用户的行为轨迹，包括动线，货架停留时长，商品PV/UV等等；天猫精灵，采用了阿里中文语义理解引擎，内置中文人机交互系统，并且依托阿里云的机器学习技术实现智能家居控制、语音购物、充值、音乐播放等功能。关于京东无界零售，其特别强调，技术驱动的零售基础设施推动用户体验与成本效率的同时升级，体验维度指智能技术实现的“比你更懂你”、”随处随想“、“所见即所得”，成本效率维度指零售基础设施一体化的开放，优化全零售系统的商品、资金、信息流动效率等；京东X无人超市，消费者只需三步即可完成购物，一是“刷脸”进入超市，通过摄像头进行人脸识别，绑定自己的京东帐户；二是挑选想要的商品，电子价签也会提前展示商品的促销价格；三是通过智慧化结算通道，就可以自动完成商品结算；同时，提供具备跟随和导航功能的智能购物车，以此节省人力及提升运营效率；D-MART由京东自主研发，采用“智能货架”、“智能称重结算台”、“智能感知摄像头”、“智能广告牌”等部分组成，可实现知人、知货、知场景的全新购物体验；依赖于D-MART和京东支付技术，顾客来到京东便利店，刷脸就可以顺利完成购物；京东智能服务平台Alpha ，面向智能行业全面开放，赋能智能硬件、智能家居、智能车载等领域，提供“技术+服务+渠道”的一站式智能解决方案，通过集成Alphas可以让智能产品获得听觉、视觉、学习能力，以及音乐、新闻、购物等服务，并获得千万级设备的控制能力。关于腾讯智慧零售及京腾计划，后面腾讯的专家将向大家介绍，我就不再赘述。接下来，与各位简略介绍一下百联全渠道的业务框架，供在座与入驻百联创业空间的创业企业参考，具体分为三个层面：第一个层面，指全渠道的平台服务；即聚焦百货、商超、大健康、汽车等业态，构建全渠道解决方案，同时为集团其他业态及外部零售企业提供全渠道解决方案的支持。第二个层面，赋能各业态，提供六大共享服务支持，能力同时可以向外开放；共享供应链服务，即搭建供应链信息服务平台，充分发挥百联各成员企业商品供应链优势，构建境外、境内共享商品供应链的能力，并向C端、B端输出；整合营销服务，指通过数字化营销的手段或者工具，基于全渠道的会员画像，在线下、线上、移动、社交等渠道，面向消费者提供全域精准营销与服务；整合会员管理，通过持续的会员运营，提升消费者的体验、复购与粘性；整合物流服务，充分发挥中心仓与门店网络的优势，推动仓店一体化建设，降低物流成本的同时，提升物流效率，并与最后一公里配送有效结合，面向消费者提供极致的物流服务体验；聚合支付服务，整合微信支付、支付宝、安付宝及银联、银行等20余种支付方式，通过聚合收银台提供给线下、线上、移动渠道使用，支持消费者便捷完成支付，同时沉淀支付数据，供后续业务增    长分析与预测使用；整合客户服务，支持电话、在线客服等多种服务方式，并区分客群提供差异化的客服支持。第三个层面，百联已初步完成全渠道技术中台、大数据平台的搭建，并启动云平台的建设。市场上商超新零售的网红“盒马”及百联推出的新零售发现店RISO等，是商超+生鲜+餐饮+物流新型融合业态的典型代表；盒马之所以能快速发展，与其强大的数字化运营能力息息相关，其消费者到店的强体验及30分钟配送上门都离不开大数据与人工智能应用的支持。简单谈一下百联在商超新零售应用创新的一些设想。首先，商超新零售的核心是O2O，即充分发挥实体门店网络的优势，我们已经初步打造形成商超新零售模式，提供给消费者的价值主要是“鲜”与“便捷”；其核心我认为是两点，第一点是，传统商超门店优化升级变成全渠道门店，同步构建新零售的基础设施，第二点是，面向消费者提供到店、社群及到家的闭环服务，为消费者提供到店强体验及极速配送到家的服务，并通过社群触达消费者以形成高频互动。关于到店服务，我们通过扫码购、自助收银等解决消费者排队结账的问题，同时在扫码购的过程中，提供精准化的促销推送，对于商家而言，扫码购也是一个非常重要的内容投放平台；此外，构建全链路能力，将消费者在店内的行为全程数据化，然后依托全域大数据及人工智能的应用，可以为消费者提供购物过程中最精准化的服务与体验；关于社群服务，构建O2O特色的人人惠与微商模式，加快社群推广，反过来，结合周边消费者的偏好，逐步调整门店的商品结构；关于到家服务，在消费者无法到店时，可以通过极速达的物流服务，将周边3KM范围内消费者需要的商品配送上门。其次，在O2O的基础上，结合消费者的购买需求，发挥商品供应链优势，叠加全球精选商品，以云超的方式提供给消费者，可以是次日达或者商品预售的模式；从平台侧来讲，也可以有效组织商品及通过仓店一体化等相对低成本的物流方式进行配送。接下来，以门店网络为中心，逐步引导门店周边的服务类商家入驻商超O2O平台，为消费者提供一站式社区生活服务，比如药品与保健品、餐饮、教育、健身、休闲、家政、家维、汽车保养及加油服务等。在商超新零售模式的打造过程中，百联非常需要各领域的创新企业与我们一道推动应用创新，如商超门店全链路应用、白名单或前置仓货架商品的组织、智能选品及价格策略优化、智能搜索、基于仓店一体化物流效率的提高、营促销成本有效性提升、风控能力的增强等。百货的O2O的模式与商超有很大的不同，商品极度丰富，换季特征明显，库存相对较浅、消费相对低频，如何加强高频互娱连接将是一个挑战。百货全渠道需要基于“场”围绕“人”切入，帮助百货门店这个“场”作大全渠道客流，服务好线下优质客户与线上长尾客户；其核心是构建基于大数据的全渠道会员营销与服务平台，实现会员在线、营销在线、运营与服务在线等；形成完善的会员体系，结合实体与线上资源，为消费者提供个性化的权益，支持不同群体区隔提供特色服务、分客群丰富营销场景等；围绕我们的“场”，帮助提升到店客流，让到店消费者能有更好的购物或逛店体验，增加停留时间，增加消费者与专柜促销员、商品的互动，进而建立消费者与“场”、与促销员、与商品的连接，并以时间序列在线呈现门店、品牌与商家、商品、促销员推荐、活动等信息，同时可以在线与促销员互动等。在会员营销与服务平台的基础上，区分奥莱、百货、购物中心，搭建云店平台，帮助门店的品牌与商家，实现商品上线，形成实体门店与数字化门店的全渠道融合；云店可以为百货业态商业综合体提供数字化经营平台，帮助门店形成在线服务和零售基础设施的建设能力，并延展到店内的各个商户；云店可以帮助门店从经营活动积累的数据资产里，挖掘出对经营策略优化、运营效率提升、指导品牌商提升销售等有价值的信息，也可以帮助店员提升点对点的销售和服务能力；云店主张将每个商业综合体都看成一个内容与销售的平台，而商户与消费者则是平台中的供需主体，基于云店平台，供需可以在场内、场外无界连接；在商场形成数据资产积累和运用的基础上，可以推动门店更具个性化和想象力的数字化重构。云店面向消费者的核心价值是两点，“即时”与“个性化”。消费者希望感受到的是一个动态、可以即时响应与满足个性化需求的在线门店，消费者可以及时了解门店、品牌、商品上新及活动等动态，帮助消费者从门店海量信息中提炼感兴趣的商品与服务，帮助其快速做出购买决策；云店可以实现“千人千面、24小时在线”，基于大数据，按照“生活方式编辑”或者是“我的店”的形式，组织消费者偏好的品牌与商品，并提供个性化的活动支持、有吸引力的内容或差异化的尊享服务等。在云店平台化之后，类似梅西百货，可以依托各百货业态门店、商家的商品供应链能力，逐步搭建精选、时尚百货平台，即形成一个大的云店，消费者可以在线浏览与选购商品，消费者下单后，通过不同的门店提供商品并配送给全国消费者。在百货新零售模式的打造过程中，百联同样需要各领域的创新企业与我们一起推动大数据与人工智能的应用创新，如门店的全链路应用、全域营销、同款推荐，内容推送策略的优化、销售预测，品牌与商品结构调整、专柜陈列动线优化等。接下来，向各位介绍一下百联科创中心近期的一些创新方向。我们在推动创新之前，需要了解零售变与不变分别是什么？变化包括场景的多元化，关系的参与化，需求的个性化，技术包括云端的智能化，网端的互联化，终端的感知与数据化，零售的改变其实是背后零售基础设施往智能化、协同化等方面发展；不变的是，商品与服务、成本与效率、体验一直是零售的本质，通过零售的升级，将其不断推向新的层次。首先，关于新技术应用创新的一些设想。我们认为，无人店的商业模式依然停留在探索阶段，无人店无疑可以带来购物体验的提升及运营效率的改进，目前主流的技术路线有两种，一种是基于RFID的技术，一种是基于生物识别、图像识别与传感等技术，百联科创中心探索的无人超市将依托于百联的商品供应链的优势，与人工智能领域的创新企业合作，利用生物识别、图像识别、传感及无感支付等技术，实现沉浸式、无感知的购物体验，完成新技术、新模式能力的沉淀，然后赋能新型便利店和传统商超门店的转型；家庭购物场景已逐步兴起，如亚马逊的ECHO，天猫精灵等，百联科创中心探索的智能家庭购物应用，将立足于用户，围绕家庭生活场景，整合优质商品与服务，联合智能家居创新企业，利用物联网、大数据及人工智能等技术，搭建百联特色的家庭服务开放平台，为家庭消费提供便捷的商品与服务；区块链技术已渐成热点，结合百联的产业布局，未来将在消费金融、生鲜的溯源及物流跟踪等领域尝试推动应用创新。第二，关于技术升级应用创新方面的思考。前面谈到，新零售最大的变化就是依托技术驱动零售基础设施的变化，那么我们现在与创新企业合作研发的全链路产品，其目标就是帮助门店将消费者在线下门店的行为全程数字化，从进店、逛的过程、停留时间、互动行为、购买与消费、自助收银直至离店，并在过程中建立用户ID、生物特征ID、商品ID的关联与精确匹配，为全域营销与服务提供基础数据支持；现在百联大数据平台已汇聚百联线下、线上及竞品平台的数据，人工智能在零售行业的应用前景将非常广泛。第三，围绕百联各成员企业新业态创新需求，提供应用创新支持。围绕百联实体门店网络及商品供应链优势，我们将尝试打造“优选”等业务模式，聚焦某些特定的生活方式与场景，组织商品，然后以O2O的模式提供给消费者。如前面所说，数字化创新是我们接下来实现新零售创新的重点，我们将依托全域大数据平台，利用新技术持续推动商品数字化、消费者数字化、场景数字化、门店数字化及管理数字化等应用创新。前面我简单向各位介绍了我们关于新零售应用创新的一些设想，期望在政府相关主管部门的指导下，发挥自身优势，并充分借助各创新、创业企业的力量，共同推动新零售应用创新，一起打造商业互联网的创新生态。谢谢大家！         主持人：    感谢彭巍总给我们带来演讲，接下来让我们有请王逸霞女士给我们带来的演讲。           王逸霞：    大家好，今天很高兴跟大家做这个腾讯智慧零售的分享，我是腾讯的智慧零售的负责AI与大数据应用产品的，今天跟大家分享，其实主要是集中在腾讯最近在智慧零售上的一些布局和产品的介绍，其实大家也知道腾讯是互联网公司最晚进入这个零售战场的企业，其实大家也都知道腾讯以往的优势在C端的一些应用包括游戏、社交是腾讯的传统的强势的领域。2B端的应用在广告领域，支付领域和服务的领域，零售这里我们是一个新的，在这一块对腾讯而言，我们是觉得有劣势也有优势劣势就是我们没有做过零售业务，知识和经验需要合作伙伴来告诉我们，对于优势我们是这样想的，其实我们因为我们没有做过这个业务，不会有这种的裁判又当运动员的身份焦虑，我们也会用更纯粹的互联网思维思考这个事情。开场跟大家直接介入主题。    今天的分享会分三个部分，第一个我们零售的一些优势，第二个智慧零售解决方案探讨，第三是一些案例。这边2个主要的大家了解一个是实体零售的销售额的瓶颈，市场越来越细分，蛋糕越来越小，线下实体店客群逐渐老龄化。如果说到今天主题，AI和大数据，腾讯在AI其实已经积累了很多其它领域的应用的经验，其实我们在坐的零售的时候，把AI能力赋于零售的领域，在大数据这一块，C端的社交矩阵，这些产品矩阵非常丰富，这些产品为我们积累的大量的对消费者的数据的洞察，这些洞察，它会起到非常关键的作用，结合起来，后面介绍到微信的一些流量场景的能力，构成我们整个做零售的基础。我们展开来看，这些数据包含哪些第一个做实体零售最关心的，地理位置的数据，这个地理位置数据通过海量通讯的2C端的应用采集到用户我们关于这些用户非常细腻的一些洞察，这些洞察包括，他们的居住场所，工作场所，他们的商圈，它是我这个商圈的流动人口，还是常驻人口，打通之后我们是不是数据，知道这些人的浏览行为，出现一个丰富的画像，第二个通过一些WIFI探针的手段捕捉用户在小场的行为，分析他们在小场的一些状态，这些状态这个ID和腾讯ID打通通过探针这个数据嫁接了线上线下数据的桥梁，前面有聊到，这个是更细的维度和微观的维度对人的行为的抓取。取抓取可以看到非常细的我们进店的这些用户，每个客户性别和年龄，购物是高兴还是不高兴，这些能为我们做实体经营起到非常有异议的指导。还有就是腾讯自身的画像标签体系我们在广告领域耕耘十几年，积累起来的能力到再在零售非常强大，积累人群的画像标签，大概两三千个，几大维度勾勒用户，包括基础的属性，包括阅读咨询兴趣，这些兴趣我对一个用户的理解，在线上的场景也用在线下的场景应用在人的场景，通过这些数据串联起来，这里展开讲怎么应用到应用实体当中。包括营销包括消费体验和运营和服务、品牌形象提升，包括安防这些部分，从营销来讲，这个本身是我们的强项，我们有非常多的这些手段可以做到的精准用户的定向，归纳总结来讲分三个部分，通过人口属性和基础查找，今天出了高端的零食，针对高收入人群，我们可以直接在系统里面找到，对它进行广告触达，这些可以通过非常精准的忙是不浪费营销预算的方式触达，如果在某些比较具体的这些区域我希望覆盖这些区域的人，其它的区域人不希望覆盖掉，通过商圈去查找可以画出电子围栏，通过渠道可以覆盖到的区域只对这些人投放。第三个通过竞品人查找，讨论过竞品的这些人，我可以针对这些人做一些针对性的触达。智能化推荐我们也有一个一整套的引擎，一个是低成本快速介入的优点，运用了大量的数据进行推荐。再往下很多的品牌商和部分零售商在做营销时候的痛点，经常与到样貌党，现在做促销的时候会经常再来一瓶，或者发一块钱或者5毛钱的红包激励用户再次消费，发出这个红包的时候，同时有大量的羊毛党通过机器程序的方式去把营销放到自己的口袋里面，这背后是真实还是机器人，在拔羊毛，尤其是双11，线下的大促的时候，这样的羊毛党大量的触摸，这个流量的产品可以恶意流量的抵御背后对这个账号真实性的解读，对瓶子上的二维码进行扫描，这个人以前有没有在微信上跟有社交关心有没有跟朋友互动过，有没有看过腾讯新闻的文章，看过腾讯新闻的视频，有过这些新闻，他可能是真实的人，在腾需上所有的行为都是参加营销行动的行为，可以判断这个人就是纯粹的羊毛党，这个时候20毫秒的时间可以做出这个判断把这个判断反馈品牌商，告诉这个账号等级0到4分，可以根据我们说的结果，决定是否正常发放红包，通过这个方式，为零售商节省大量的预算。    第二块讲体现，人脸支付现在估计在场的很多朋友都有接触过，很多的超市，都已经开通这样的人脸支付的体验，好处在于，其实原先我们说我们不需要现金支付，直接刷脸就可以支付。这样的场景可以在于很大的集市内很多的商铺，这个用户每个都会结算，都要掏手机支付，人脸支付一开始把自己的微信账号和人脸做一次绑定之后每次的商户逛的时候，拿好商品就可以离店，然后直接扣款。第二个就是我们超市里面，扫码这个场景可以很好的解决，收银闲的时候闲死，忙的时候忙死的场景。每个商品放上商品的二维码，客户打开小程序之后，只要去扫商品的二维码，这个商品自动添加购物车，整个购物的过程，就是扫码添加的过程。在这个场景里实体的货架里面，这个人不想到去旁边买牙刷，如果我告诉他这2个东西收买有优惠有客观去那个货架把牙刷也拿了，这个扫码购的场景可以提升销售的可能性，可以节省收银的能力，客户自主完成购物，可以自主离开，我只要在出口这里加一个人做抽检的配置可以完成大量的自主结算的场景，这个场景包括沃尔马等已经铺上了扫码购，大家有机会也可以体验一下。    然后再一块互动屏这个，这个更多对用户端比较好的体验，这个所谓互动屏的互动体验跟生态上伙伴做的，进店之后，互动屏可以扫到人脸和状态，摄像头可以设备性别和年龄，根据你的状态给你推荐衣服，然后，它挑选这个衣服最终完成购买之后也是抓刷脸支付的过程，就可以离店。这样的互动屏在这个店进了以后，当月的应收比上月提升19%，很多客户进来以后很想玩一下，一个东西吸引进店发生交易的可能性大大提升，这样的产品主要就是在服饰行把客户从店外吸引进店，提高成交可能性。    再一个体验升级，一个是我们现在必胜客的店里面做它是一个灯光根据音变换情绪的，这是我们实验室的产品，我们正式商用化了，利用在很多的品牌搞快神殿和黑科技的体验店这些店里面有一些比较高科技的新奇的一些互动的场景之下，这样的灯光是非常吸引顾客的，可以跟机器人做联动，在店内发一个语音AI解析的小机器人，它可以在店里行走，知道店里面发生的情况，第二个可以跟顾客聊天，其实是内置的百科词条，根据自身的业态多增加一些业态的专业对答，而且可以点歌，顾客店内的参与感非常强，他心情不好点了北上的灯光，就很蓝，所以这种体验其实对顾客来说非常好的。    前面的都讲是一个C端的体验的提升，这里讲一下大数据，怎么做，第一个大数据的能力，跟选址相关的能力，有开放伙伴合作，底层能力有介绍到，这个大数据我们去学习用的属性，包括人口数，然后提出的信息，然后我们可以圈定最有价值的商圈在哪里我原因做选址人肉去踩点，这个可能传统的选址方式的，展开上海图你关注的这些指标，我希望这里的小孩浓度高，可以直接告诉你，在哪些区域，里面的用户我倒到这个平台上，这些人有类似属性的人分布在哪里，可以告诉你在哪里，这些点可以重点去踩点的地方，完成踩点可能有10个地址待选，最后一部做开垫的销量侧，可以基于大量的历史数据，学习它在这个地方，周围人修改什么样的属性的时候，其实我们秋收可以预测未来10个地方开店，每家店月销量达到多少，最后应该选择哪个地址，这个是基于大数据的选址的逻辑。第二个我们讲到店里面当一个人进店的时候可以识别出这个顾客是不是一个老顾客还是新顾客，所有的数据保存在云端，可以跨店做识别，今天上午买车，然后上个周末逛了家附近的4S店，看了车，可能有形成初步的意向，下一周，下班的时候公司附近有一个牌子的4S店，这个时候再看，多我去4S店店的时候告诉4S店电源这个顾客是第二次来了，对4S店的销售来说，比第一次的承担概率高很多，这个电源非常紧密跟这个顾客和潜在顾客互动，变成真正的销售，所以对老客的识别，可以帮助工作人员判断这个顾客的历史偏好，它的一个交易的成交的潜力，从而能够帮助他更好的推荐商品。    第三个就是同样人脸识别技术，同我们可以知道这个顾客进店这些人动线是什么样，其实这个技术并不新鲜，第三方的公司创业公司独立公司都有这个能力，腾讯都有这个能力，区别在于哪里，这里可以展开讲一下，基于这一页店内的动线的识别，第二个远景看一下，关心进店的人反应在店外20米内多少人，多少人进到我店，每天只是路过我店，但是不进来，在外围这个之数据通过腾讯的数据获取，这两种数据的结合可以形成非常完善的漏斗，到最终发生交易的，在我这个店外的每天可能会进入店但是没有经过，或者全量的人群，每天进入我店的人是什么样的，他们在我店发生了什么，他们怎么走的，对什么感兴趣，第三层有没有发生交易，逛什么动线的人发生了交易，什么样没有发生改易，到最后哪些人是我的一个忠实顾客，哪些会员，哪些非会员，他们的行为是不是有不同，如果不同，怎么为进行输出决策，是腾讯具备的一个独特的能力，第二个大家知道这样的AI计算好耗费计算资源，对于腾讯而言，我们的计算资源和成本共享，编辑成本是比较低的，第二是在完整上，特训有独特的优势。第三个讲到大株距和货之间的关系，今天早上看到腾讯的友商和腾讯做智慧零售的区别，腾讯主要在在场和人没有货，货恰恰是重要的环节，觉得是非常大的缺憾，所谓腾讯不碰货不做货的买卖之间的差价生意，我们怎么应用数据加上商户自身的数据为产品输出决策，这个逻辑和刚刚提到的选址逻辑非常类似，第一个看到商圈的流量，包括其它的天气交通这些因素放在模型里面。这浪者数据经过融合之后，可以输出选品的建议和洞察，包括买这些品类的人，是具有什么样的画像，这个画像是有非常还的及时性，今天是不是有人看某一个综艺或者的电视剧口红爆火，可以非常快找到这些变化，看这档综艺或者电视剧，突然对某一款口红感兴趣集中哪些区域，可以告诉商户你的店铺可以进这些，这些所有的店里面，周巍这样人有属性，这个商品是有热销，可以告诉你把这个店的成功经验复制另外一家店，这样的品类的关系可以学习出来的，这个是选品的例子还可以做一些我今天做促销，然后促销之前做备货，这个备货备多少，我们是可以童工机器学习的能力去预测我这个货，搞这次促销搞多少正好，这些大数据的产品能力，释放出来之后可以提升整个供应链协同。然后这里讲的视觉AI的能力，我们是跟商品相关的，可以监控门店的陈列是否符合标准，很多的连锁店对分店管理的时候存在痛点，店长没有按照的总统店的意愿陈列，如果商品缺货了仓库有货，上市比较大，工作人员没有及时补货识别出来可以及时告诉。第三个对门店人员精细化管理，这个场景里面，服饰行业应用比较多，有讲到服饰行业非常注重我要把这个顾客吸引到店，我的导购有没有为这个顾客提供完美的服务有没有推荐衣服有没有形成试穿，这样的一些行为是总部非常关注，原因没有办法被数字化，这些通过人抽查，然后获得，这个也是可以通过视觉AI解决这个问题有一套的算法可以识别这个导购和顾客陪同多久，多少人发生销售转化，所以这样可以为总部管理自己的导购的形成非常好的数据指导，同样在这边服务提效这里，可以利用微信的窗口，其实如果我能够通过小程序和微信跟顾客性急互动，可以形成便捷的体验，用户商户小程序可以直接聊天对话，第二个入口，支付订单这里可以进行商品的咨询，第三个商户和企业微信里面的沟通，这个企业也是针对顶首行业的很多痛点，可能我们在门店内很多的工作人员加顾客的微信有心的促销活动的时候可以一对一的沟通，跟顾客建立紧密的联系，一旦这个人离职这些信息就丢失了，它的顾客没有办法沉淀它的企业数据库里，而是个人的手机微信里面，很多的企业到最后禁止自己的导购使用微信，但是不适用微信又形成不了忠诚可顾客的培养。然后对顾客这一侧没有区别，他依旧使用微信，这两者是互通，这导购离职，这也数据还是在的企业的。然后这边再讲一下安防，一个是我们可以对监控中的小偷进行标记，未他再来他就会报警，人流过多的会进行一个报警，进行疏散，第三个是小孩相关，它自己上了自动扶梯，或者没有家长陪同，可以提醒工作人员去看一下这个小孩的情况，这些对于服务体验和安防体验的提升。最后够是跟品牌提升相关的这个是品牌的产品，我们内部使用做游戏，游戏的一个产品，这一块把它在今年年初的时候对2B端的商业化，优势在于一个我们对自身的腾讯数据的完整性上，因为其实像这些产品在市面上很多大量的三方公司在做，主要通过爬虫爬取数据的，数据的及时性和完整性有欠缺的，所以数据的完整性，一个统计数据的完整性上，我们抓取所有用户授权公开渠道可被抓取的一些数据，然后通过自然源处理分析这些用户讨论品牌的时候是正面还是负面的情绪，讨论竞品的时候他们说了一些什么，讨论我的商品有没有一些危机公关的苗头出来，一出来就会舰艇到，同时也会看一下10万家的媒体网站的数据和大V，整个数据源是比较完整的。    最后和大家分享一下案例，一个是和永辉超市的合作几个月以来，我们主要做的四块，其实已经落地的包括刚刚提到的全网采集产品，还有人脸支付，这块我们在永辉个别门店完成了落地，最后一个刚刚提到的人脸识别的技术在门店的应用，包括动线，顾客到店提醒，全部在店内落地了。然后第二个服饰行业百丽，主要落地也是场内的应用能力，其实它跟超市行业场景不一样，我去抓取动线，但是服饰行业从店外到店内的过程，和流失程度和抓取，超市行业更关注人跟货架之间怎么互动，这两个侧重点有所不同，百丽落地之后，百丽也比较动脑筋思考，这个店装了这套系统怎么提升收入，他们也研究了很多采集来的数据，这个可以分享几个点，一个是说他们那家店铺再生真大概300平米左右，有一些柱子的区域，走的概率比较低，成交率很低，先这个数据，在白区区放了很多颜色心鲜艳的产品，引导顾客往那边。第二点这个店是耐克的一个店，它原先女装占比40%左右，女装的颜色比较暗淡，但是通过数据发现，进店的女顾客，多拿顾客，然后它提升女装的占比尽了款式更加新的，更时尚的款式，做了调整之后，当月的女装的收入提升了40%，其它品类不变，所以今天跟大家分享就是这些，谢谢大家。           主持人：    非常感谢王逸霞女士的分享。接下来有请促进中心首批合作伙伴的代表桑文锋先生主题演讲。           桑文锋：    大家下午好，很高兴能做这次分享，相比腾讯的嘉宾我更加务实一些，新零售有很多的可以想象的地方，落地起来挑战比较大的。    我觉得有两个核心问题，一个是数据底子薄，一个角度是有了很多的数据，但是我们如果去看我们这些实际的场景特别是新零售的场景，有一些数据收集不到，其实我们讲数据化的产品，对于IT化做到位，数据才可以收集起来，很多企业有一些数据，但是数据怎么联通起来，怎么应用起来，这个基础非常差，依靠技术的发展是逐步迭代的过程。我们神策整个业务基于两条我们对于整个行业的认识，或者核心理念，第一条数据源很重要，数据分析的过程，千方百计把底子做好，如果把数据更加实效收集起来，另一方面看数据的价值，从神策来看一点，给人去用，还是我们管理上我们药用数据去说话，我们有了数据更好的做决策，更好的去开放，另外一方面，驱动产品智能，利益理解这么一个模式有一了一定的数据基础，然后套上一定的算法。其实在我看来数据它的价值更多体现在产品智能，现在比较多是AI这块，3、5年之后肯定AI的场景会占更多的比例。我们神策目前做了一款产品，就是神策分析解决用户行为分析，客户大头还是互联网的线上的业务，围绕产品市场运营，还有管理者，我们对他有一个更好的支撑，应用场景最有价值的，有4点，第一点营销分析，不同的渠道，从不同的渠道打广告，获客，不同的转化渠道怎么样，这些情况需要做数据分析，分析不同的渠道和转化怎么样，这是一个场景，另外是产品迭代，还有说我们有了一些做了一些功能，评估它到底好坏，把数据分析融入核心的环节里面去，第三点就是用户运营，我们所谓的用户运营准备不同任不同的策略，对用户进行分群，这里面是非常有价值的，最后一点就是产品职能，神策有专门的推荐引擎，做商品推荐，神策推荐这一块有优势的，帮助客户把底层的数据建的更好有了更好的数据，结果也是会更好的，这里补充一点，神策强调，神策是帮助客户去实现数据驱动的，不掌握客户的数据。其实在线下的场景和线上不一样，线上许多行为可以直接捕捉到，浏览一个商品，点击一个商品，支付提交，都可以拿到，线下就没什么，来说一些没有理想，许多场景你识别率还有一些准确性，都是一个问题，然后我觉得起码以线下用户的采集满足这三点，第一点识别人，第二点识别关键动作，第三点识别把他们两者串联起来，比如说有一些场景用摄像头把这个人识别出来，新老用户识别出来，这里面做到了识别人，第二点识别关键动作到一个店里面，跟售货员沟通一次，相对这些都是关键动作，怎么把更好的有效记录下来，而且成本要可控。在新零售数据分析上，从三点去考虑它，我们小考虑线上线下的数据打通，线上不用说，线下我们现在这些条件不是很具备，尽量多把它记录下来，一些交易数据可以拿到，大家现在微信、支付宝支付，用户是新老用户我们这些信息可以识别出来，搜集的用户多一点利用，跟业务数据之间的打通比如吃成本和情况，对于用户在线上的或者店里面这些交易的交互的数据，把他们有效打通起来，第三点我们考虑数据驱动，这个数据落板可以看一下是不是理想状态，让每个店长都可用到这个数据，还有我们的流程，不管前面的营销还是周边的产品设计，是不是应用起来把思维发展一些，不是哪些环节里面据。这个用户行为，其实我们是在千方百计用户的一些场景还原出来，它一些维度信息把记录下来，这样后面制作分析的时候把维护进行组合，不然的话可能摄像头可能一些红外的方式，搜集了人流量，进来多少，出来多少，你只是收集这些信息你做更多的分析你做不今天的身高分布怎么样的，采集数据的时候把更全更细的采集下来，这也是跟百联合作的，一个场景是百联这个线上行业应用，跟我们产品可以很好的支持，另一方面线下，我们一起探讨合作，神策本身做大型的分析，或者软件方面，硬件和一些合作方合作。这是我们目前的客户情况，现在神策成立3年时间，客户数不是很多，客户质量比较高，本身像刚才提到的永辉、百联都是神策的客户，我们一起在探索，一些的新领域的应用。最后一块在整个服务客户上的一叶探索，我之所以说挑战是因为太难了，不是说他们去引入一个系统把数据问题解决起来，这里面有非常大的挑战从2015年最早从事大数据分析领域，最早考虑怎么做产品，我们对漏斗分析是最强，数据处理能力最的，可以很好的满足客户，后来发现不是这样其实很多时候客户这边，大数据的员工是不是足够，在这种情况下你真正落地挑战非常大，不是说有一个好产品可以做下来，我们在2016年的下半年开始考虑把服务做起来，专门安排技术支持，安排分析师和客户梳理业务和事件、维度，一步一步代入，在一些互联网创业公司可以很好的支持，支持这个之后从2016年底2015年相对大的公司，物联网+的行业十前的又组不了，针对互联网客户的时候一个客户成功去给他办方案提交给客户落地了，一些大客户过了两周原地踏步什么没有做，真正做交付还是需要有人做，然后又招聘了商铺经理这些够味，我们去年6到10月份，花4个月时间做了大量工作，像客户银联、中元银行这样的客户可以很好的交流一下，去年国庆交付也可以做下来，发现新的问题，前面数据接不进去了，数据指标也会很好的配置出来，如何实际的业务里面把数据用起来，又是很大的挑战，然后又开始对我们一些大客户节分析你整体的产品情况怎么样，哪些环节有问题，然后接着改，在2015年刚开始创业的时候自己有一个愿景花10年时间重构中国互联网的这个事情，京国3年，现在离十万八千里，接触客户越多，大的环境，跟理想状态有非常大的距离，这个需要我们做更多的工作。    然后，在这个过程里面，我们不断强化我们服务体系怎么把整个服务做好，不是说你有一个好的产品就可以了，如何让客户给客户带来的加分，最早的时候只做产品，整个服务体系变成3条，如何做服务服务重要的流程和组织，如何分析数据这都是一系列的丢成，把这个流程建好，你要不同的决策去服务不同的工作，你有一个员工能力很强，客户的服务靠一个人解决，你这个质量没有办法解决，另外一点效率，哪个客户出10个人满足它的需求，但是自的效率从哪里来，可以之前的生意，挣钱我们需要借助工具，通过工具提审效率，更网上是咨询，大的战略客户可以提供咨询，帮助他一步一步落地下来，这部分价值更大一些。    那我们为了更好的服务客户，我们去开发自己的工单服务中心，不说一个客户人员只是为了出现什么问题说清楚，这样也是提升效率的方式，另一方面做了一个产宾，客户权声明周期管理，在坐各位有一些做2B业务的，你服务的那些客户几千个几万个他们用的情况怎么样，满意度挺高的，大部分满意你各异这么多，你实际使用良好的比例，使用一般多少，使用相对差一点多少，没用起来多少，续约情况怎么样，哪些问题可以很好的解答，为什么出现这种情况，中国整个软件行业是这么过来的。我们自己本身去更好的做的产品维护好我们的客户，如何给我们的这些企业服务人员给他们使用，让他们更好的服务客户。然后对于我们自己做企业服务这一块，我们强调是一个全流程的数据运营，我们不是这些环节里面可以把这些数据采集下来，这样的去服务客户的时候更好的提供效率。    我分享的内容就这些，我自己也写了一本书，如果有兴趣可以购买一下。           主持人：    谢谢桑文锋，下面有请冯杰夫先生带来的主题演讲。           冯杰夫：    很荣幸今天有机会跟大家做一个分享，感谢百联集团和百联科创把我们列为合作伙伴。我们确实是刚成立的企业，属于初创企业，听前面几位的介绍有偏零售的方向，有偏大数据方向，我们金边介绍角度更偏人工智能，我们是一个以AI技术出发点，为导向的公司，以AI技术体校和赋能，从本质怀着比较谦卑和崇敬的心用一项技术用在行业里面。    简单介绍一下我们公司，我们公司是成立于去年的2017年7月份，我们总部在上海，目前团队成员包括来自美国的硅谷和西雅图的自身的科学家，以及国内从百度、阿里巴巴、腾讯出来的一些工程师组成的团队，我们目前包括新东方的联合创始人，和IDG资本合伙人都是名以上的合伙人，现在的合作伙伴，有百联集团，有京东，有银联商务，还有因特尔。    简单介绍一下我本人，我在上海读书读了7面，然后在美国加州读的博士，就职于美国世界500强零售企业，负责智能零售系统的研发，我之前的工作，包括识别商场的行人，包括追踪他们的一些行为，当这些顾客在商店里面成组购物的时候，组成团队，一些行为和动作，然后在去美国之前，我本身是跟零售行业完全没有关系，完全搞技术，在读博士期间，在学校附近尝试经营哈根达斯的冰淇淋店，当时发现零售行业有很多的可以提效和改进的地方，哈根达斯每天衡量买多少的时候是用尺子去量，这个完全可以通过更加新近和自动化的技术更快的完成这件事情，毕业之后在美国的零售企业里面做相关的科技工作，更加亲身感受到零售行业需要做的转变，提效赋能，怎么吸引顾客来到我的商店，节省商店的成本，运营更高效，下边是我曾经做的技术，包括三维重建，基于三维的人脸识别。然后简单介绍一下我们的成品，我们公司是做什么的呢，现在国内归为三大无人，无人驾驶，一个是无人机，再一个无人店，无人店说法不是很贴切，作为一个商店也是有一运营人员的，我们说的无人店以后不需要消费者结算的过程，一切结算都是自动化，有朝一日我们去商店不会有人收银，你买东西之后，一切结算都是自动完成，可以在几秒钟之内收到你的账单，这么做的好处不需要收银员了，因为收银云是重复性很高的工作，每天不停的收作为消费者不需要排队，像北京、上海生活节奏很快的时候，不需要排队，帮助顾客节省时间，本身有很大的价值的。这是一个演示，买完东西以后，账单会很快的现实到的手机APP上，支持很多人同时购物，并且账单收的很快，我们究竟在做什么，使零售高更小，让零售更简单。这是我们的冰山模型，我们睡眠仆役看到是全新的国务体验，从此不需要排队，出门可以结算，完全无感的，它带来的好处，可以让购物更快捷更有趣，对于年轻人，手机和移动支付，大家非常喜欢用，也非常喜欢的方式，更多人年轻人有了体验之后，到你店里消费，没有这项服务的店需要排队，也会有一种引领的效果，我们做这个事情最大的价值在水面的下面，可以更了解顾客，我们怎么样使用无感支付，出门去结算，里面用到了大量的人工智能技术，我的技术和无人驾驶技术，重合度非常高，人工智能里面三大技术，一个叫计算机视觉，比图象处理高一个维度的技术，二维图象处理停留在图象处理的层面，我们主要用到三维信息。根据这些数据来实现，一个了解顾客，某些人喜欢什么东西，买什么东西，还可以使购物方式更多样，你其实可以利用移动段的支付，做更多的事情，比如说线上线下结合在一起卖货，APP上下单，可以上门提，或者送货上门，第五可以提高服务质量，可以五顾客，服务消费者，可以做更高频次，补货使消费者不会产生缺货的情况，说了这么一堆，我具体给大家展示一下我们的系统，两个店的例子，包括这个店，是京东总部的一家店，大家有机会去京东总部可以体验一下，根据这两个店的观察，消费者跟我们的产品非常喜欢，尤其是年轻人，这两个地方都是年轻人群体比较大的地方，大家每次买完东西感觉很精研，这样出来可以结算了，感觉是黑科技。然后然后大家看一下，这个是我们的一个系统，我们通过这套系统，只是前端的展示，现在是真实发生的，这是刚才给你们看的右边的店现在真实发生的情况，现在店里有5个客人，这一切都是实时的，每个顾客在哪个商店的位置可以知道，点开这些顾客，知道鼓舞车有什么，我点进去的某一个顾客，这个顾客此时此刻正在发生的，这个顾客正在挑选商品，通过下面的平台，下面正在实时发生的事情有顾客离店这个交易花了多少钱，这个从一个4个维度上，包括三维物理空间和时间，所有数据都知道，当然大家不用当心隐私的问题，这些都是计算机进行识别的，包括你购物的行为和活动，完全又AI智能系统自动分析和识别的。    接下来还会做一些比较有趣的时间，包括3D陈列系统，以前零售企业做的陈列都是二维的，可能还是单单停留在，货物的落架图也好纸上写画就可以了，一下子跳过平面设计，到了三维，这个三维重建就是当时展现的真实的三维重建，你可以看到所有的东西，我那边真实商店发生一些变化，这个系统也会相应发生一些变化，可以实时观察这个产品哪个货架缺货，一系列的信息可以从这个系统里挖掘出来。然后可以听一下来自真实顾客的评价。总之就是顾客的反应，感觉购物非常的便捷，第二个觉得，很节省时间，因为它可以自主的选购，购物全程不会有商店的营业人交互他感觉很自由。    然后今天的分享大概就是这样一个，非常感谢大家。           主持人：    非常感谢冯杰夫带来的精彩演讲。在大屏幕大家可以看到今天交流的群希望大家可以入群，让我们有更多的交流，今天的活动到这里告一段落，非常感谢大家来支持我们希望未来有更多的交流的机会，接下来的时间在场交流，也可以退场。";

        one_obj.makePostCall(url, sentence);
        //System.out.println(str);
    }


    private String makePostCall(String url,String content){

        if (true){

            try {
                try (CloseableHttpClient httpclient = HttpClients.createDefault()) {

                    List<NameValuePair> form = new ArrayList<>();
                    form.add(new BasicNameValuePair("user_name", ""));
                    form.add(new BasicNameValuePair("content", content));
                    UrlEncodedFormEntity entity = new UrlEncodedFormEntity(form, Consts.UTF_8);

                    HttpPost httpPost = new HttpPost(url);
                    httpPost.setEntity(entity);
                    System.out.println("Executing request " + httpPost.getRequestLine());

                    // Create a custom response handler
                    ResponseHandler<String> responseHandler = response -> {
                        int status = response.getStatusLine().getStatusCode();
                        if (status >= 200 && status < 300) {
                            HttpEntity responseEntity = response.getEntity();
                            return responseEntity != null ? EntityUtils.toString(responseEntity) : null;
                        } else {
                            throw new ClientProtocolException("Unexpected response status: " + status);
                        }
                    };
                    String responseBody = null;
                    try {
                        responseBody = httpclient.execute(httpPost, responseHandler);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("----------------------------------------");
                    System.out.println(responseBody);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


            return "";
        }
        return "";
    }

}

