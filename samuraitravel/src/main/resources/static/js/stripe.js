const stripe = Stripe('pk_test_51QzBrbKrltHl7wpqV9GSdbjPR6YbrQXYqNQtGmWmhwVfbvzOB2Wuthcjr1Yw0hrKWTSsftabSltnRpyOb4Q2GGvz00rDFP7II6');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
	stripe.redirectToCheckout({
		sessionId: sessionId
		})
		});