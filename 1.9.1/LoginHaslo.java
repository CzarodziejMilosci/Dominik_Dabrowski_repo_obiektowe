	
	class LoginHaslo{
		private String haslo = "";
		private String login = "";
		private LoginHaslo(String haslo, String login){
			this.haslo = haslo;
			this.login = login;
			System.out.println(+login+" "+haslo+);
			
			
		}
		
		
		@override
		public String toString(){
			return haslo+" "+login;
		}
	}
	