package develop.service.api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class CreditCardResult.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxiResult {

	/** 智付通商店代號 Varchar(15) */
	@JsonProperty("MerchantID")
	public String merchatId;

	/** 本次交易授權金額.Int(15) */
	@JsonProperty("Amt")
	public Integer amt;

	/** 由智付通平台產生的系統交易序號。Varchar(20) */
	@JsonProperty("TradeNo")
	public String tradeNo;

	/** 商店自訂的訂單編號。Varchar(20) */
	@JsonProperty("MerchantOrderNo")
	public String merchantOrderNo;

	/**
	 * 支付方式
	 * 
	 * Varchar(10) 以英文代號方式回應： CREDIT=信用卡付款 VACC=銀行 ATM 轉帳付款 WEBATM=網路銀行轉帳付款
	 * BARCODE=超商條碼繳費 CVS=超商代碼繳費
	 * 
	 */
	@JsonProperty("PaymentType")
	public String paymentType;

	/**
	 * 
	 * 支付狀態
	 * 
	 * Int(1) 以數字回應，其代表下列意含： 0=未付款 1=付款成功 2=付款失敗 3=取消付款
	 */
	@JsonProperty("TradeStatus")
	public Integer tradeStatus;

	/**
	 * 金融機構回應碼 Varchar(10) (1.由收單機構所回應的回應碼。 2.若交易送至收單機構授權時已是失敗狀態,則本欄 位的值會以空值回傳。)
	 */
	@JsonProperty("RespondCode")
	public String respondCode;

	/**
	 * 授權碼Varchar(6) (1.由金融機構所回應的授權碼。2.若交易送至收單機構授權時已是失敗狀態,則本欄 位的值會以空值回傳。)
	 */
	@JsonProperty("Auth")
	public String auth;

	/**
	 * 授權日期 Varchar(8) (1.格式為 yyyymmdd,例:20140304。 2.若交易送至收單機構授權時已是失敗狀態,則本欄
	 * 位的值會以空值回傳。)
	 */
	@JsonProperty("AuthDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd")
	public Date authDate;

	/** 授權時間 Varchar(6) 1.格式為 hhmmss,例:164828。2.若交易送至收單機構授權時已是失敗狀態,則本欄位的值會以空值回傳。 */
	@JsonProperty("AuthTime")
	public String authTime;

	/** 卡號前六碼 Varchar(6) 1.信用卡卡號前六碼。2.若交易送至收單機構授權時已是失敗狀態,則本欄位的值會以空值回傳。 */
	@JsonProperty("Card6No")
	public String card6No;

	/** 卡號後四碼 Varchar(4) 1.信用卡卡號後四碼。 2.若交易送至收單機構授權時已是失敗狀態,則本欄位的值會以空值回傳。 */
	@JsonProperty("Card4No")
	public String card4No;

	/**
	 * 信用卡到期日 Varchar(4) 格式為 yymm,例 1912=2019 年 12 月。
	 */
	@JsonProperty("Exp")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yymm")
	public Date exp;

	/**
	 * ECI 值 Varchar (2) 1.3D 回傳值 eci=1,2,5,6,代表為 3D 交易。 2.若交易送至收單機構授權時已是失敗狀態,則本欄
	 * 位的值會以空值回傳。
	 */
	@JsonProperty("ECI")
	public String ECI;

	/**
	 * 交易 IP Varchar(15) 付款人交易時的 IP。
	 */
	@JsonProperty("IP")
	public String ip;

	/**
	 * 履保銀行 Varchar(10) 1.該筆交易履約保證銀行。 2.如商店是直接與銀行簽約的信用卡特約商店,當使 用信用卡支付時,本欄位的值會以空值回傳。
	 * 3.履保銀行英文代碼與中文名稱對應如下: [Esun] :玉山銀行 [Taishin] :台新銀行
	 */
	@JsonProperty("EscrowBank")
	public String escrowBank;

	/**
	 * 約定信用卡付款授權之有效日期Date(1.格式為 yyyy-mm-dd,yyMM 例
	 * 2019-12-31。2.實際約定信用卡付款授權之有效日期,以此欄位回傳日期為主, 非以商店設定之日期。3.當超過此約定信用卡付款之有效日期時,則無法再
	 * 以”約定信用卡付款授權 Token”進行”已約定授 權”交易。)
	 */
	@JsonProperty("TokenLife")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyMM")
	public Date tokenLife;

	/**
	 * 檢核碼 用來檢查此次資料回傳的合法性,商店串接時可以比 CheckCode 檢核碼 Hash 對此欄位資料 來檢核是否為智付通平台所回傳,檢核 方法請參考
	 * 附件二。
	 */
	@JsonProperty("CheckCode")
	public String checkCode;

	/** 約定信用卡付款授權 Token Varchar(70)( 1.授權成功才會回傳 2.提供商店於「已約定信用卡授權」時使用。) */
	@JsonProperty("TokenValue")
	public String tokenValue;

	/** The auth bank. */
	@JsonProperty("AuthBank")
	public String authBank;

	/** 交易建立時間DateTime智付通接收到此筆交易資料的時間，回傳格式為：2014-06-2516:43:49 **/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonProperty("CreateTime")
	public Date createTime;
	/** 支付時間DateTime智付通接收到此筆交易付款完成資訊的時間，回傳格式為：2014-06-2516:43:49 **/
	@JsonProperty("PayTime")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	public Date payTime;
	
	/** 預計撥款日Date預計撥款的時間，回傳格式為：2014-06-25 **/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@JsonProperty("FundTime")
	public Date fundTime;

	/** 請款金額Int(11)此筆交易設定的請款金額 **/
	@JsonProperty("CloseAmt")
	public Integer closeAmt;
	
	/** 請款狀態Int(1)請款狀態依不同情況，設定值代表下列意含：0=未請款 1=等待提送請款至收單機構 2=請款處理中 3=請款完成 **/
	@JsonProperty("CloseStatus")
	public Integer closeStatus;
	
	/** 可退款餘額Int(11)此筆交易尚可退款餘額，若此筆交易未請款則此處金額為 0 **/
	@JsonProperty("BackBalance")
	public Integer backBalance;
	
	/** 退款狀態Int(1)退款狀態依不同情況，設定值代表下列意含: 0=未退款 1=等待提送退款至收單機構 2=退款處理中 3=退款完成 **/
	@JsonProperty("BackStatus")
	public Integer backStatus;
	
	/** 授權結果訊息Varchar (50)文字，銀行回覆此次信用卡授權結果狀態。 **/
	@JsonProperty("RespondMsg")
	public String respondMsg;
	
	/** 分期-期別Int(3)信用卡分期交易期別。 **/
	@JsonProperty("Inst")
	public Integer inst;
	
	/** 分期-首期金額Int(10)信用卡分期交易首期金額。 **/
	@JsonProperty("InstFirst")
	public Integer instFirst;
	
	/** 分期-每期金額Int(10)信用卡分期交易每期金額。 **/
	@JsonProperty("InstEach")
	public Integer instEach;
	
	/** 紅利交易類別Int(1)此筆信用卡交易是否為使用紅利折抵之交易： 0=一般交易 1=紅利交易 **/
	@JsonProperty("Bonus")
	public Integer Bonus;

	/** 紅利折抵金額Int(15)若為紅利交易，此為本次交易實際紅利折抵之金額。若為一般交易，此參數固定為 0。 **/
	@JsonProperty("RedAmt")
	public Integer redAmt;
	/**
	 * 付款資訊Varchar(50)1.付款方式為超商代碼(CVS)時，此欄位為超商繳款代碼。 2.付款方式為條碼(BARCODE)時，此欄位為繳款條
	 * 碼。此欄位會將三段條碼資訊用逗號”,”組合後回 傳。3.付款方式為 ATM 轉帳時，此欄位為金融機構的轉 帳帳號，括號內為金融機構代碼，例：
	 * (031)1234567890。
	 **/
	@JsonProperty("PayInfo")
	public String payInfo;
	
	/** 繳費有效期限Datetime1.格式為 Y-m-d H:i:s 。例：2014-06-29 23:59:59。 **/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonProperty("ExpireDate")
	public Date expireDate;

	public String getMerchatId() {
		return merchatId;
	}

	public void setMerchatId(String merchatId) {
		this.merchatId = merchatId;
	}

	public Integer getAmt() {
		return amt;
	}

	public void setAmt(Integer amt) {
		this.amt = amt;
	}

	public String getMerchantOrderNo() {
		return merchantOrderNo;
	}

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTokenValue() {
		return tokenValue;
	}

	public void setTokenValue(String tokenValue) {
		this.tokenValue = tokenValue;
	}

	public Date getTokenLife() {
		return tokenLife;
	}

	public void setTokenLife(Date tokenLife) {
		this.tokenLife = tokenLife;
	}

	public String getCheckCode() {
		return checkCode;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public Date getAuthDate() {
		return authDate;
	}

	public void setAuthDate(Date authDate) {
		this.authDate = authDate;
	}

	public String getAuthTime() {
		return authTime;
	}

	public void setAuthTime(String authTime) {
		this.authTime = authTime;
	}

	public String getCard6No() {
		return card6No;
	}

	public void setCard6No(String card6No) {
		this.card6No = card6No;
	}

	public String getCard4No() {
		return card4No;
	}

	public void setCard4No(String card4No) {
		this.card4No = card4No;
	}

	public Integer getInst() {
		return inst;
	}

	public void setInst(Integer inst) {
		this.inst = inst;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getEscrowBank() {
		return escrowBank;
	}

	public void setEscrowBank(String escrowBank) {
		this.escrowBank = escrowBank;
	}

	public String getECI() {
		return ECI;
	}

	public void setECI(String eCI) {
		ECI = eCI;
	}

	public Date getExp() {
		return exp;
	}

	public void setExp(Date exp) {
		this.exp = exp;
	}

	public String getAuthBank() {
		return authBank;
	}

	public void setAuthBank(String authBank) {
		this.authBank = authBank;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Integer getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(Integer tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getRespondCode() {
		return respondCode;
	}

	public void setRespondCode(String respondCode) {
		this.respondCode = respondCode;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Date getFundTime() {
		return fundTime;
	}

	public void setFundTime(Date fundTime) {
		this.fundTime = fundTime;
	}

	public Integer getCloseAmt() {
		return closeAmt;
	}

	public void setCloseAmt(Integer closeAmt) {
		this.closeAmt = closeAmt;
	}

	public Integer getCloseStatus() {
		return closeStatus;
	}

	public void setCloseStatus(Integer closeStatus) {
		this.closeStatus = closeStatus;
	}

	public Integer getBackBalance() {
		return backBalance;
	}

	public void setBackBalance(Integer backBalance) {
		this.backBalance = backBalance;
	}

	public Integer getBackStatus() {
		return backStatus;
	}

	public void setBackStatus(Integer backStatus) {
		this.backStatus = backStatus;
	}

	public String getRespondMsg() {
		return respondMsg;
	}

	public void setRespondMsg(String respondMsg) {
		this.respondMsg = respondMsg;
	}

	public Integer getInstFirst() {
		return instFirst;
	}

	public void setInstFirst(Integer instFirst) {
		this.instFirst = instFirst;
	}

	public Integer getInstEach() {
		return instEach;
	}

	public void setInstEach(Integer instEach) {
		this.instEach = instEach;
	}

	public Integer getBonus() {
		return Bonus;
	}

	public void setBonus(Integer bonus) {
		Bonus = bonus;
	}

	public Integer getRedAmt() {
		return redAmt;
	}

	public void setRedAmt(Integer redAmt) {
		this.redAmt = redAmt;
	}

	public String getPayInfo() {
		return payInfo;
	}

	public void setPayInfo(String payInfo) {
		this.payInfo = payInfo;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

}
