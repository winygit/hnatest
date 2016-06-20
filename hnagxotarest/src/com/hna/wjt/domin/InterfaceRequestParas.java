package com.hna.wjt.domin;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class InterfaceRequestParas {
	private String In;
	private String OTAcode;
	private String token;
	private String timestamp;
	private String login;

	public InterfaceRequestParas(String oTAcode, String token) {
		super();
		OTAcode = oTAcode;
		this.token = token;
		this.timestamp = System.currentTimeMillis() + "";
	}
	
	public static InterfaceRequestParas getInstance()
	{
		String OTACode = "GXAIRLINES_120";
		String key = "69CDDG7D0042E4C672F46F0BACGAE3H2";
		String hostIP = "220.249.72.237";

		InterfaceRequestParas irp = new InterfaceRequestParas(OTACode, key,
				hostIP);
		
		return irp;
	}

	public InterfaceRequestParas(String oTAcode, String key, String hostIP) {
		super();
		OTAcode = oTAcode;
		this.timestamp = System.currentTimeMillis() + "";

		token = oTAcode + hostIP + this.timestamp + key;
		token = md5(token);

	}

	private String md5(String tokenb) {

		String restult = null;
		try {
			// ����ʵ��ָ��ժҪ�㷨�� MessageDigest ����
			MessageDigest md = MessageDigest.getInstance("MD5");
			// ʹ��ָ�����ֽ��������ժҪ��
			md.update(tokenb.getBytes());
			// ͨ��ִ���������֮������ղ�����ɹ�ϣ���㡣
			byte b[] = md.digest();
			// ���ɾ����md5���뵽buf����
			int i;
			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			restult = buf.toString();// 32λ�ļ���

		} catch (Exception e) {
			e.printStackTrace();
		}

		return restult;

	}

	public String getIn() {
		return In;
	}

	public void setIn(String in) {
		In = in;
	}

	public String getOTAcode() {
		return OTAcode;
	}

	public void setOTAcode(String oTAcode) {
		OTAcode = oTAcode;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
