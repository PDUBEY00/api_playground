package com.learning.api_playground.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(value = {"avatar", "data"})
public class Data {
		
		private int id;
		@JsonProperty("first_name")
        private String firstName;
		@JsonProperty("last_name")
        private String lastName;
		
		
        
        public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getAvatar() {
			return avatar;
		}
		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}
		private String avatar;
        

}