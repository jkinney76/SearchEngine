package engine;



public class Field {
	
	String[] field = new String[2];//Initializes a length 2 array
	
	//Construct for field object
	Field(String FieldName, String FieldValue) {
		field[0] = FieldName;
		field[1] = FieldValue;
	}
	
	//returns the field name
	public String getFieldName() {
		return field[0];
	}
	
	//returns the field value
	public String getFieldValue() {
		return field[1];
	}
	
	//setter that maggie yang wrote
	public void setFieldEntry(String name, String value) {
		field[0] = name;
		field[1] = value;
	}
}
