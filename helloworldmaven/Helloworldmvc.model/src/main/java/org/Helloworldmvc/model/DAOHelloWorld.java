package org.Helloworldmvc.model;

public class DAOHelloWorld {
	private String FileName = "HelloWorld.txt";
	private DAOHelloWorld instance = null;
	private String helloWorldMessage = null;

		private DAOHelloWorld() {
			
		}
		public DAOHelloWorld getInstance() {
			return instance;
			
		}
		public void setInstance(DAOHelloWorld instance) {
			
		}
		public void readFile() {
			
		}
		public String getHelloWorldMessage() {
			return FileName;
			
		}
		public void setHelloWorldMessage(String helloWorldMessage) {
			
		}
}
