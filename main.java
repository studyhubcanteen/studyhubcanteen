// Simple form validation and feedback for the contact form
document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('contact-form');
    if (form) {
        form.addEventListener('submit', function (e) {
            e.preventDefault();

            // Simple feedback (replace with AJAX if needed)
            alert('Thank you for contacting Hostel Insider! We will get back to you soon.');

            form.reset();
        });
    }
});