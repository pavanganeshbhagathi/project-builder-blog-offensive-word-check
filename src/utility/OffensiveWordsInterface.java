package utility;

import model.Blog;

public interface OffensiveWordsInterface
{
	public boolean checkBlogTitle(Blog blog); 
	public boolean checkBlogDescription(Blog blog);
}