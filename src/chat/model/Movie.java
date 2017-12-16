package chat.model;

import java.time.LocalDate;
/**
 * 
 * Model that relates to every aspect of the movies
 * @author Dustin Schimel
 *
 */
public class Movie
{
	private String title;
	private String genre;
	private String ratingMPAA;
	private String review;
	private int length;
	private LocalDate releaseDate;
	private double starScore;
	
	/**
	 * Initializes all the data members
	 * @param title
	 */
	public Movie(String title, String genre, String ratingMPA, String review, int length, LocalDate releaseDate, double starScore)
	{
		this.title = "";
		this.genre = "";
		this.ratingMPAA = "";
		this.review = "";
		this.length = 0;
		this.releaseDate = LocalDate.now();	//may need to fix this
		this.starScore = 0;
	}

	public String getTitle()
	{
		return title;
	}

	public String getGenre()
	{
		return genre;
	}

	public String getRatingMPAA()
	{
		return ratingMPAA;
	}

	public String getReview()
	{
		return review;
	}

	public int getLength()
	{
		return length;
	}

	public LocalDate getReleaseDate()
	{
		return releaseDate;
	}

	public double getStarScore()
	{
		return starScore;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public void setRatingMPAA(String ratingMPAA)
	{
		this.ratingMPAA = ratingMPAA;
	}

	public void setReview(String review)
	{
		this.review = review;
	}

	public void setLength(int length)
	{
		this.length = length;
	}

	public void setReleaseDate(LocalDate releaseDate) //may need to fix this
	{
		this.releaseDate = releaseDate;
	}

	public void setStarScore(double starScore)
	{
		this.starScore = starScore;
	}
	
	public String toString()
	{
		String description = "This is a movie description";
		
		return description;
	}
}
