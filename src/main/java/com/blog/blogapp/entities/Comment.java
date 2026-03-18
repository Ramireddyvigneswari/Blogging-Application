package com.blog.blogapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "comments")
public class Comment {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(columnDefinition = "TEXT")
	    private String content;

	    // Many comments → One Post
	    @ManyToOne
	    @JoinColumn(name = "post_id")
	    private Post post;

	    // Many comments → One user
	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;

}
