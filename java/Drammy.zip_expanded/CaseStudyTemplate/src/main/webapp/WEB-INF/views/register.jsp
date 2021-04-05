<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

	<meta charset="utf-8">
	<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">
	
	<title>Drammy - Register</title>
	
	<!-- Bootstrap core CSS -->
	<style><%@include file="/resources/vendor/bootstrap/css/bootstrap.min.css"%></style>
	
	<!-- Custom fonts for this template -->
	<style><%@include file="/resources/vendor/fontawesome-free/css/all.min.css"%></style>
	<style><%@include file="/resources/vendor/simple-line-icons/css/simple-line-icons.css"%></style>
	<link
		href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic"
		rel="stylesheet" type="text/css">
	
	<!-- Custom styles for this template -->
	<style><%@include file="/resources/css/style.css"%></style>
	
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<script>
		// JavaScript for disabling form submissions if there are invalid fields
		(function() {
			'use strict';
			window.addEventListener('load', function() {
				// Fetch all the forms we want to apply custom Bootstrap validation styles to
				var forms = document.getElementsByClassName('needs-validation');
				// Loop over them and prevent submission
				var validation = Array.prototype.filter.call(forms, function(form) {
					form.addEventListener('submit', function(event) {
						if (form.checkValidity() === false) {
							event.preventDefault();
							event.stopPropagation();
						}
						form.classList.add('was-validated');
					}, false);
				});
			}, false);
		})();
	</script>

</head>

<body>

	<!-- Navigation -->
	<nav class="navbar navbar-light bg-light static-top">
		<div class="container">
			<a class="navbar-brand" href="/Drammy">Drammy</a> <a
				class="btn btn-dark custom-btn" href="/Drammy/signIn">Sign In</a>
		</div>

	</nav>

	<!-- Masthead -->
	<header class="masthead text-white text-left">
		<div class="overlay"></div>
		<div class="container">
			<div class="row">
				<div class="col-xl-9 mx-auto">
					<h1 class="mb-5">Create account...</h1>
				</div>
				<div class="col-md-10 col-lg-8 col-xl-7 mx-left">
					<form class="needs-validation" action="/Drammy/createAccount" method="POST" novalidate
						oninput='confirmPassword.setCustomValidity(confirmPassword.value != password.value ? "Passwords do not match." : "")'>
						<div class="form-group">
							<div class="form-row">
								<div class="form-group col-md-6">
									<label for="firstName">First Name</label> <input type="text"
										class="form-control" name="firstName" id="firstName"
										placeholder="First Name...">
								</div>
								<div class="form-group col-md-6">
									<label for="lastName">Last Name</label> <input type="text"
										class="form-control" name="lastName" id="lastName" placeholder="Last Name...">
								</div>
							</div>
							<label for="userName">Username</label> <input type="text"
								class="form-control" name="username" id="userName"
								placeholder="Create username..." required maxlength="20">
							<div class="invalid-feedback">Please enter a valid Username
							</div>
							<small id="usernameHelp" class="form-text text-light">*Limit
								20 characters</small>
						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="password">Create Password</label> <input
									type="password" class="form-control" name="password" id="password"
									placeholder="Create password..." required>
								<div class="invalid-feedback">Please enter a valid
									password</div>
							</div>
							<div class="form-group col-md-6">
								<label for="confirmPassword">Confirm Password</label> <input
									type="password" class="form-control" name="confirmPassword" id="confirmPassword"
									placeholder="Re-type password..." required>
								<div class="invalid-feedback">Passwords do not match</div>
							</div>
						</div>
						<div class="form-check">
							<input type="checkbox" class="form-check-input"
								id="exampleCheck1" required> <label
								class="form-check-label" for="exampleCheck1">I am at
								least 21 years of age.</label>
							<div class="invalid-feedback">Must confirm legal drinking
								age to proceed</div>
						</div>
						<button type="submit" class="btn text-white submit-btn">Create
							Account</button>
					</form>
				</div>
			</div>
		</div>
	</header>

	<!-- Icons Grid -->
	<section class="features-icons bg-light text-center">
		<div class="container">
			<span class="font-italic font custom-span">"The best whiskey
				is the whiskey you like, the way you like to drink it!"</span>
		</div>
		<span class="font-italic font-weight-light custom-span">-
			Whiskey Tribe</span>
	</section>

	<!-- Image Showcases -->
	<section class="showcase">
		<div class="container-fluid p-0">
			<div class="row no-gutters">

				<div class="col-lg-6 order-lg-2 text-white showcase-img"
					style="background-image: url('img/pot_still.jpeg');"></div>
				<div class="col-lg-6 order-lg-1 my-auto showcase-text">
					<h2>All Scotch is whiskey...</h2>
					<p class="lead mb-0">...but not all whiskey is Scotch. Scotch
						is but one variation of whiskey. Other styles of whiskey include,
						Bourbon, Irish, Canadian, Japenese, and many more!</p>
				</div>
			</div>
			<div class="row no-gutters">
				<div class="col-lg-6 text-white showcase-img"
					style="background-image: url('img/tasting_glasses.jpeg');"></div>
				<div class="col-lg-6 my-auto showcase-text">
					<h2>"Tasting" is different than "drinking"</h2>
					<p class="lead mb-0">The goal is to evaluate and enjoy the
						whiskey. Sip a little bit at a time, taking note of the aroma,
						texture, and ultimately the flavor, just as you would when tasting
						wine.</p>
				</div>
			</div>
			<div class="row no-gutters">
				<div class="col-lg-6 order-lg-2 text-white showcase-img"
					style="background-image: url('img/enjoy_whiskey.jpeg');"></div>
				<div class="col-lg-6 order-lg-1 my-auto showcase-text">
					<h2>What is the best whiskey?</h2>
					<p class="lead mb-0">Whether you enjoy a dram neat, on the
						rocks, or mixed in a tasty cocktail, the best whiskey is the
						whiskey you like the way you like to drink it.</p>
				</div>
			</div>
		</div>
	</section>

	<!-- Testimonials -->
	<section class="testimonials text-center bg-light">
		<div class="container">
			<h2 class="mb-5">What people are saying...</h2>
			<div class="row">
				<div class="col-lg-4">
					<div class="testimonial-item mx-auto mb-5 mb-lg-0">
						<img class="img-fluid rounded-circle mb-3"
							src="img/testimonials-1.jpg" alt="">
						<h5>Margaret E.</h5>
						<p class="font-weight-light mb-0">"This is fantastic! Thanks
							so much guys!"</p>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="testimonial-item mx-auto mb-5 mb-lg-0">
						<img class="img-fluid rounded-circle mb-3"
							src="img/testimonials-2.jpg" alt="">
						<h5>Fred S.</h5>
						<p class="font-weight-light mb-0">"Bootstrap is amazing. I've
							been using it to create lots of super nice landing pages."</p>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="testimonial-item mx-auto mb-5 mb-lg-0">
						<img class="img-fluid rounded-circle mb-3"
							src="img/testimonials-3.jpg" alt="">
						<h5>Sarah W.</h5>
						<p class="font-weight-light mb-0">"Thanks so much for making
							these free resources available to us!"</p>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- Call to Action -->
	<section class="call-to-action text-white text-center">
		<div class="overlay"></div>
		<div class="container">
			<div class="row">
				<div class="col-xl-9 mx-auto">
					<h2 class="mb-4">Ready to get started? Sign up now!</h2>
				</div>
				<div class="col-md-10 col-lg-8 col-xl-7 mx-auto">
					<form>
						<div class="form-row">
							<div class="col-12 col-md-9 mb-2 mb-md-0">
								<input type="email" class="form-control form-control-lg"
									placeholder="Enter your email...">
							</div>
							<div class="col-12 col-md-3">
								<button type="submit" class="btn btn-block btn-lg btn-primary">Sign
									up!</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>

	<!-- Footer -->
	<footer class="footer bg-light">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 h-100 text-center text-lg-left my-auto">
					<ul class="list-inline mb-2">
						<li class="list-inline-item"><a href="#">About</a></li>
						<li class="list-inline-item">&sdot;</li>
						<li class="list-inline-item"><a href="#">Contact</a></li>
						<li class="list-inline-item">&sdot;</li>
						<li class="list-inline-item"><a href="#">Terms of Use</a></li>
						<li class="list-inline-item">&sdot;</li>
						<li class="list-inline-item"><a href="#">Privacy Policy</a></li>
					</ul>
					<p class="text-muted small mb-4 mb-lg-0">&copy; Dustin
						Hatzenbuhler - 2021</p>
				</div>
				<div class="col-lg-6 h-100 text-center text-lg-right my-auto">
					<ul class="list-inline mb-0">
						<li class="list-inline-item mr-3"><a href="#"> <i
								class="fab fa-facebook fa-2x fa-fw"></i>
						</a></li>
						<li class="list-inline-item mr-3"><a href="#"> <i
								class="fab fa-twitter-square fa-2x fa-fw"></i>
						</a></li>
						<li class="list-inline-item"><a href="#"> <i
								class="fab fa-instagram fa-2x fa-fw"></i>
						</a></li>
					</ul>
				</div>
			</div>
		</div>
	</footer>

	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>