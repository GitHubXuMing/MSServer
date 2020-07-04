package com.company.jdbc.common;

public enum ResultEnum {
	ERROR_USER_IS_NULL(101,"error:用户名不能为空"),
	ERROR_PASSWORD_IS_NULL(102,"error:密码不能为空"),
	ERROR_PASSWORD_LENGTH_LIMIT(103,"error:密码必须大于等于3位"),
	ERROR_DAO_SQL_EXCEPTION(104,"error:数据库执行异常，请联系运维人员排查错误"),
	ERROR_LOGIN(105,"error:登录失败，请检查用户名及密码是否匹配"),
	ERROR_ID_IS_NULL(106,"error:用户信息查询，ID不能为空"),
	ERROR_RESULT_NOT_FOUND(107,"error:没有查询到结果"),
	ERROR_REGIST(108,"error:注册失败"),
	ERROR_INSERT(109,"error:新增失败"),
	ERROR_DELETE(120,"error:删除失败"),
	ERROR_UPDATE(121,"error:更新失败"),
	ERROR_ILLEGLE_ARGUMENTS(122,"error:非法参数"),
	SUCCESS(200,"success:执行成功"),
	SUCCESS_LOGIN(201,"success:登录成功")
	;
	private int code;
	private String msg;
	private ResultEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	};
	
}
