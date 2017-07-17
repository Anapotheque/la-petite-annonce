package fr.meehome.training.qualification.hallofmirrors;

public enum ElementsEnum {
	MIRROR("#"),
	EMPTY("."),
	ME("X");
	
	private String value;
	
	ElementsEnum(String value){
		this.setValue(value);
	}

	public static ElementsEnum getElement(String value){
		for(ElementsEnum elementsEnum : ElementsEnum.values()){
			if(elementsEnum.getValue().equals(value)){
				return elementsEnum;
			}
		}
		return null;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
