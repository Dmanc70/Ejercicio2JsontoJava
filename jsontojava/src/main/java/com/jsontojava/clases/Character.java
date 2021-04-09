package com.jsontojava.clases;


import java.util.ArrayList;
import java.util.List;

public class Character {
	   private int char_id;
	    private String name;
	    private String birthday;
	    private ArrayList<String> occupation;
	    private String img;
	    private String status;
	    private String nickname;
	    private ArrayList<Integer> appearance;
	    private String portrayed;
	    private String category;
	    private ArrayList<String>  better_call_saul_appearance;
		
	    public Character() {
	    	
	    }

		public Character(int char_id, String name, String birthday, ArrayList<String> occupation, String img,
				String status, String nickname, ArrayList<Integer> appearance, String portrayed, String category,
				ArrayList<String> better_call_saul_appearance) {
			super();
			this.char_id = char_id;
			this.name = name;
			this.birthday = birthday;
			this.occupation = occupation;
			this.img = img;
			this.status = status;
			this.nickname = nickname;
			this.appearance = appearance;
			this.portrayed = portrayed;
			this.category = category;
			this.better_call_saul_appearance = better_call_saul_appearance;
		}

		public int getChar_id() {
			return char_id;
		}

		public void setChar_id(int char_id) {
			this.char_id = char_id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBirthday() {
			return birthday;
		}

		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}

		public ArrayList<String> getOccupation() {
			return occupation;
		}

		public void setOccupation(ArrayList<String> occupation) {
			this.occupation = occupation;
		}

		public String getImg() {
			return img;
		}

		public void setImg(String img) {
			this.img = img;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getNickname() {
			return nickname;
		}

		public void setNickname(String nickname) {
			this.nickname = nickname;
		}

		public ArrayList<Integer> getAppearance() {
			return appearance;
		}

		public void setAppearance(ArrayList<Integer> appearance) {
			this.appearance = appearance;
		}

		public String getPortrayed() {
			return portrayed;
		}

		public void setPortrayed(String portrayed) {
			this.portrayed = portrayed;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public ArrayList<String> getBetter_call_saul_appearance() {
			return better_call_saul_appearance;
		}

		public void setBetter_call_saul_appearance(ArrayList<String> better_call_saul_appearance) {
			this.better_call_saul_appearance = better_call_saul_appearance;
		}

		
	    
	    
		
	    
	    
	    
	    
}
