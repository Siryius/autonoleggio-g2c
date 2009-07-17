package util;

public class QueryCriteria 
{
	private String attributo;
	private String value;
	
	public QueryCriteria(String attributo, String value)
	{
		this.attributo=attributo;
		this.value=value;
	}
	
	public String getAttributo() {
		return attributo;
	}
	public void setAttributo(String attributo) {
		this.attributo = attributo;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
