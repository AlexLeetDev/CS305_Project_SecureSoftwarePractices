package com.snhu.sslserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.time.LocalDateTime;

@RestController
public class ChecksumController {

    @GetMapping("/hash")
    public String getChecksum() throws NoSuchAlgorithmException {
        // Data string with details
        String data = "Hello, this is Alex Leet!<br>" +
                      "Course: CS 305 Secure Software Development<br>" +
                      "Application: SSL Server for Secure Communication<br>" +
                      "This checksum demonstrates secure communication using SHA-256 encryption.";

        // Generate the SHA-256 checksum for the data string
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(data.getBytes());

        // Convert the checksum to Base64 format
        String checksum = Base64.getEncoder().encodeToString(hashBytes);

        // Get the current timestamp and calculate the validity period
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime validUntil = now.plusYears(1);

        // Return the data string, checksum, timestamp, and validity period
        return "<html><head>" +
               "<link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css' rel='stylesheet'>" +
               "<link href='https://fonts.googleapis.com/css2?family=Fira+Code&display=swap' rel='stylesheet'>" +
               "</head><body style='font-family: Fira Code, monospace; background-color: #2d2d2d; color: #ffffff; margin: 0; padding: 0;'>" +
               "<div style='position: absolute; top: 10px; left: 10px; padding: 10px; background-color: #424242; border-radius: 8px; box-shadow: 0px 4px 10px rgba(0,0,0,0.5); font-size: 11px; max-width: 600px;'>" +
               "<h2 style='color: #ffffff; font-size: 20px; text-transform: uppercase; font-weight: bold;'><i class='fas fa-check-circle'></i> Checksum Verification</h2>" +
               "<h3 style='font-size: 14px; color: #ffffff;'>Data:</h3><p>" + data + "</p>" +
               "<h3 style='font-size: 14px; color: #ffffff;'>Checksum:</h3><p>" + checksum + "</p>" +
               "<h3 style='font-size: 14px; color: #ffffff;'>Generated on:</h3><p>" + now + "</p>" +
               "<h3 style='font-size: 14px; color: #ffffff;'>Valid until:</h3><p>" + validUntil + "</p>" +
               "</div>" +
               "</body></html>";
    }
}
