package caseStudy;

public class Client {
	abstract class Item {
		private int idNum;
		private String title;
		private int numCop;
		public int getIdNum() {
			return idNum;
		}
		public void setIdNum(int idNum) {
			this.idNum = idNum;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getNumCop() {
			return numCop;
		}
		public void setNumCop(int numCop) {
			this.numCop = numCop;
		}
		@Override
		public String toString() {
			return "Item [idNum=" + idNum + ", title=" + title + ", numCop=" + numCop + "]";
		}
		public void print() {
			System.out.println("Title:"+title);
			System.out.println("Item Number"+idNum);
			System.out.println("Number of Copies"+numCop);
		}
	}
	abstract class WrittenItem extends Item {
		private String authorName;

		public String getAuthorName() {
			return authorName;
		}

		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		
	}
	class Book extends WrittenItem {
		
	}
	class JournalPaper extends WrittenItem {
		private int yearOfPub;
		
	}
	abstract class MediaItem {
		private int runTime;

		public int getRunTime() {
			return runTime;
		}

		public void setRunTime(int runTime) {
			this.runTime = runTime;
		}

		@Override
		public String toString() {
			return "MediaItem [runTime=" + runTime + "]";
		}
		
	}
	class Video extends MediaItem {
		private String dirName;
		private String genre;
		private int yearOfRel;
		public void idNum(int i) {
			// TODO Auto-generated method stub
			
		}
		public void setIdNum(int i) {
			// TODO Auto-generated method stub
			
		}
		public void setTitle(String string) {
			// TODO Auto-generated method stub
			
		}
		public void setNumCop(int i) {
			// TODO Auto-generated method stub
			
		}
	}
	class CD extends MediaItem {
		private String artist;
		private String genre;
		public void setIdNum(int i) {
			// TODO Auto-generated method stub
			
		}
		public void setTitle(String string) {
			// TODO Auto-generated method stub
			
		}
		public void setNumCop(int i) {
			// TODO Auto-generated method stub
			
		}
	}
	public static void main(String[] args) {
		Client cl=new Client();
		Book b=cl.new Book();
		JournalPaper j=cl.new JournalPaper();
		Video v=cl.new Video();
		CD c=cl.new CD();
		b.setAuthorName("Robin Sharma");
		b.setTitle("The monk who sold his ferrari");
		b.setNumCop(5);
		System.out.println("book 1 author :"+b.getAuthorName()+" "+b.getTitle()+" "+b.getNumCop());
		System.out.println(b.toString());
		System.out.println("---------------------------------");
		j.setAuthorName("Shashi Tharoor");
		j.yearOfPub=2019;
		j.setTitle("Indian Politics");
		j.setNumCop(1000);
		System.out.println("Journal 1 :"+j.getAuthorName());
		System.out.println("Year of publication :"+j.yearOfPub);
		System.out.println(j.toString());
		System.out.println("----------------------------------");
		v.dirName="Rk Hirani";
		v.genre="fiction";
		v.yearOfRel=2022;
		v.setRunTime(5);
		v.setIdNum(101);
		v.setTitle("PK");
		v.setNumCop(10);
		System.out.println("Director: "+v.dirName);
		System.out.println("Genre: "+v.genre);
		System.out.println("Year of Release: "+v.yearOfRel);
		System.out.println("Runtime:"+v.getRunTime());
		System.out.println(v.toString());
		System.out.println("----------------------------------");
		c.artist="Honey";
		c.genre="Punjabi";
		c.setIdNum(101);
		c.setTitle("PK");
		c.setNumCop(10);
		c.setRunTime(5);
		System.out.println("Artist:"+c.artist);
		System.out.println("Genre:"+c.genre);
		System.out.println("Runtime:"+c.getRunTime());
		
		
		
		
	}

}
/**/
