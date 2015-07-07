package com.fdt.ecomadmin.ui.controller.util;

import java.util.ArrayList;
import java.util.List;

public class ExportConstants {

	public static String DATE_CREATED ="Date Created";
	public static String LAST_LOGIN="Last Login";
	public static String EMAIL ="Email";
	public static String FIRM_ADMIN ="Firm Admin";
	public static String FIRST_NAME ="First Name";
	public static String LAST_NAME ="Last Name";
	public static String PHONE ="Phone";
	public static String FIRM_NAME ="Firm Name";
	public static String FIRM_NUMBER ="Firm Number";
	public static String BAR_NUMBER ="Bar Number";
	public static String AUTHORIZATION_REQUIRED ="Authorization Status";
	public static String RECURRING_USER ="Recurring User";
	public static String PAYMENT_DUE ="Payment Due";
	public static String ACCESS_OVERRIDDEN ="Access Overridden";
	public static String USER_STATUS ="User Status";
	public static String ACCOUNT_LOCKED ="Account Locked";

	public static String TRANSACTION_DATE ="Transaction Date";
	public static String TRAN_REF_NUMBER ="Transaction Reference #";
	public static String SITE_REF_NUMBER ="Sale Transaction Reference #";
	public static String CARD_NUMBER ="Card Number";
	public static String NAME_ON_CARD ="Name on Card";
	public static String TOTAL_TX_AMOUNT ="Total Transaction Amount";
	public static String TRAN_TYPE ="Transation Type";


	public static String CHECK_NUMBER ="Check Number";
	public static String CHECK_DATE ="Check Date";
	public static String SITE_NAME ="Site Name";
	public static String BANK_NAME ="Bank Name";
	public static String PAYMENT_TYPE ="Payment Type";
	public static String TOTAL_TRANSACTIONS ="Total Transactions";
	public static String CLIENT_IP_ADDRESS ="Client IP Address";
	public static String CHECK_GENERATED_BY ="Check Generated By";
	public static String COMMENTS ="Comments";
	public static String AMOUNT ="Amount";
	public static String ECHECK ="ECheck";
	public static String VOID ="Void";




	public static List<String> getUsersHeaders(){
		List<String> headers = new ArrayList<String>();
		headers.add(EMAIL);
		headers.add(FIRM_ADMIN);
		headers.add(FIRST_NAME);
		headers.add(LAST_NAME);
		headers.add(PHONE);
		headers.add(AUTHORIZATION_REQUIRED);
		headers.add(RECURRING_USER);
		headers.add(PAYMENT_DUE);
		headers.add(ACCESS_OVERRIDDEN);
		headers.add(USER_STATUS);
		headers.add(ACCOUNT_LOCKED);
		headers.add(LAST_LOGIN);
		headers.add(DATE_CREATED);
		headers.add(FIRM_NAME);
		headers.add(FIRM_NUMBER);
		headers.add(BAR_NUMBER);
		return headers;
	}

	public static List<String> getCheckHistoryHeaders(){
		List<String> headers = new ArrayList<String>();
		headers.add(CHECK_NUMBER);
		headers.add(CHECK_DATE);
		headers.add(SITE_NAME);
		headers.add(BANK_NAME);
		headers.add(PAYMENT_TYPE);
		headers.add(TOTAL_TRANSACTIONS);
		headers.add(CLIENT_IP_ADDRESS);
		headers.add(CHECK_GENERATED_BY);
		headers.add(COMMENTS);
		headers.add(AMOUNT);
		headers.add(ECHECK);
		headers.add(VOID);
		return headers;
	}

	public static List<String> getTxHeaders(){
		List<String> headers = new ArrayList<String>();
		headers.add(TRANSACTION_DATE);
		headers.add(TRAN_REF_NUMBER);
		headers.add(SITE_REF_NUMBER);
		headers.add(CARD_NUMBER);
		headers.add(NAME_ON_CARD);
		headers.add(TOTAL_TX_AMOUNT);
		headers.add(TRAN_TYPE);
		return headers;
	}


}