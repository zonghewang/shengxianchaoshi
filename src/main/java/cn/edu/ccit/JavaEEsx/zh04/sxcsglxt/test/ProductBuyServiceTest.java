package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Buy;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.BuyInfo;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductBuyService;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.util.BaseTest;

public class ProductBuyServiceTest extends BaseTest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource(name = "ProductBuyService")
	IProductBuyService iProductBuyService;
	
	/**
	 * 进行单元测试
	 * 1.添加注解名称@Test
	 * 2.方法名称必须设置为返回值为void 参数为void
	 * 3.进行测试的编码
	 */
	@Test
	public void createBuyAndSetBuyInfo(){
		Buy buys = new Buy();
		buys.setPkBid(1l);
		buys.setPkUid(2l);
		buys.setIsSeasonal((byte)0);
		buys.setBuyInfo("asdasd"); 
		buys.setBuyName("asd");
		buys.setIsInStorehouse((byte)0);
		buys.setBuyTime(new java.sql.Date(System.currentTimeMillis()));
		
		BuyInfo buyInfos = new BuyInfo();
		buyInfos.setPkBid(1l);
		buyInfos.setPkBiid(3l);
		buyInfos.setPkPid(4l);
		buyInfos.setPkSpid(5l);
		buyInfos.setBuyInfoNum(2123);
		buyInfos.setBuyInfoOther("应季");
		Object objbuyinfos = new Object() ;
		objbuyinfos = JSON.toJSON(buyInfos);

		iProductBuyService.createBuyAndSetBuyInfo(buys, JSON.toJSON(objbuyinfos));
	}
	@Test
	public void deleteBuyAndSetBuyInfo() {
		Buy buys = new Buy();
		buys.setPkBid(1l);
		buys.setPkUid(2l);
		buys.setIsSeasonal((byte)0);
		buys.setBuyInfo("asdasd"); 
		buys.setBuyName("asd");
		buys.setIsInStorehouse((byte)0);
		buys.setBuyTime(new java.sql.Date(System.currentTimeMillis()));
		
		BuyInfo buyInfos = new BuyInfo();
		buyInfos.setPkBid(1l);
		buyInfos.setPkBiid(3l);
		buyInfos.setPkPid(4l);
		buyInfos.setPkSpid(5l);
		buyInfos.setBuyInfoNum(2123);
		buyInfos.setBuyInfoOther("应季");
		List<BuyInfo>buyInfo = new ArrayList<BuyInfo>();
		buyInfo.add(buyInfos);
		System.out.println(JSON.toJSON(buyInfo));
		
		iProductBuyService.deleteBuyAndSetBuyInfo(buys, JSON.toJSON(buyInfo));
	}
	@Test
	public void updateBuyAndSetBuyInfo(){
		Buy buys = new Buy();
		buys.setPkBid(1l);
		buys.setPkUid(2l);
		buys.setIsSeasonal((byte)0);
		buys.setBuyInfo("asdasd"); 
		buys.setBuyName("asd");
		buys.setIsInStorehouse((byte)0);
		buys.setBuyTime(new java.sql.Date(System.currentTimeMillis()));
		
		BuyInfo buyInfos = new BuyInfo();
		buyInfos.setPkBid(1l);
		buyInfos.setPkBiid(3l);
		buyInfos.setPkPid(4l);
		buyInfos.setPkSpid(5l);
		buyInfos.setBuyInfoNum(2123);
		buyInfos.setBuyInfoOther("应季");
		List<BuyInfo>buyInfo = new ArrayList<BuyInfo>();
		buyInfo.add(buyInfos);
		System.out.println(JSON.toJSON(buyInfo));
		
		iProductBuyService.updateBuyAndSetBuyInfo(buys, JSON.toJSON(buyInfo));
}
	@Test
	public void getBuyAndSetBuyInfoByName() {
		Buy buys = new Buy();
		buys.setBuyName("asd");
		System.out.println(iProductBuyService.getBuyAndSetBuyInfoByName(buys));
	}
	@Test
	public void getBuyAndSetBuyInfoByBid(){
		Buy buys = new Buy();	
		buys.setPkBid(2l);
		List<BuyInfo>buyInfo = new ArrayList<BuyInfo>();
		buyInfo =iProductBuyService.getBuyAndSetBuyInfoByBid(buys);
		for (BuyInfo buyInfos : buyInfo) {
			System.out.println(buyInfos.getPkBid());
			System.out.println(buyInfos.getPkPid());
			System.out.println(buyInfos.getPkSpid());
			System.out.println(buyInfos.getPkBiid());
			System.out.println(buyInfos.getBuyInfoNum());
			System.out.println(buyInfos.getBuyInfoOther());
		}
}
	@Test
	public void getAllBuyAndSetBuyInfo() {
		Buy buys = new Buy();

		buys.setPkBid(2l);
		System.out.println(iProductBuyService.getAllBuyAndSetBuyInfo());
	}
	@Test
	public void deleteBuy() {
		Buy buys = new Buy();
		buys.setPkBid(2l);
		iProductBuyService.deleteBuy(buys);
	}
}
