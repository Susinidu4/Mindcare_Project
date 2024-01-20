package Insert;

public class Feedback {
    private int id;
    private String name;
    private String email;
    private String rating;
    private String message;

	public Feedback(int id, String name, String email, String rating, String message) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.rating = rating;
		this.message = message;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
