/*
 * We need to make a Chat application that provides basic functions 
 * (read, send and receive messages).
 * The clients that connect to the chat can join a chat room, create a new chat
 * room and show all available chat rooms.
 * 
 * The server, to which the clients connect will have to manage and store the 
 * chat rooms and it's changes. In order to create a chat room the client needs
 *  to write the name of the chat room, followed by a unique randomly generated
 *   alphanumeric identifier, generated by the server. Example: Room43#98Jkp1 .
 * The client can also choose to assign a password to the chat room, this will 
 * convert the chat room to a private one and the only the clients that know 
 * the password can connect to that room.
 * 
 * The chat rooms will behave according to the following rules:
 *	- The maximum message length is of 140 characters.
 * 	- When a client sends a message, the message travels trough the server 
 * which is tasked to do a broadcast of it so it gets to all the clients.
 * 	- In order to disconnect the client needs to write the command 
 * "/disconnect".
 *
 * In order to avoid man-in-the-middle attacks all the messages sent trough the
 *  messaging app will be encrypted with an RSA encryption(the encryption type 
 *  will be chosen by the student,all while it chooses one of the ones seen 
 *  in class).
 *  
 *  For the encryption we can use either java.security.keyPair or 
 *  java.crypto.cypher
 *  Every message sent between the client and the server must be encrypted 
 *  except the first one where the client and server exchange public keys
 *  Once a client disconnects it needs to disappear from the the list in 
 *  the room(the list that contains all the client connected to the room).
 */

package server;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class MainServer {
	public static void main(String[] args) throws IOException, NoSuchAlgorithmException{
		Server server=new Server();
		
		System.out.println("Starting server....\n");
		server.run();
	}
}