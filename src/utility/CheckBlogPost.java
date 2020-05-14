package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker  implements  OffensiveWordsInterface{
	
	String[] bad_words = {"ahole","bitch","cock","dick","erotic","fcuk","gay","heroin","injun","jerk","kill","lesbo","murder","niggle","orally","pawn","quicky","racy","sadist","teez","uterus","virgin","weed","xxx","yobbo","zibbi"};

	@Override
	public boolean checkBlogTitle(Blog blog) {

		 String title=blog.getBlogTitle();
		 for(int i=0;i<25;i++) {
			 if(title.equalsIgnoreCase( bad_words[i])) {
				 return true;
				 
			 }
		}
		return false;

	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		String description=blog.getBlogDescription();
		for(int i=0;i<bad_words.length;i++)
			{
			if(description.equalsIgnoreCase(bad_words[i]))
				return true;
		}
	     return false;
	}

	@Override
	public boolean checkBlog(Blog blog) {
	
		if((checkBlogTitle(blog))||(checkBlogDescription(blog))) {
			return false;
		}
		return true;
	}

}