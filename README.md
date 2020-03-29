# stellerAndroidAppHack4NSIT
 > Platform for people to share their own stories and read others stories. Each user can sign up/log in, has his/her own profile. Home page shows suggestion of stories to read. First attempt at Android development 

Team Name: Array
> Aishanya Singh 2016UCO1669,
> Damak Bajaj 2016UCO1647,
> Priyanka Sahani 2016UCO1667


Netaji Subhas Institute of Technology,Delhi

> Summary

“Everyone is a writer. Everyone has a story to tell, some are written in the books and some are confined to hearts. In this era of technology, we don’t have time to preserve these uncountable stories that each one of us have. But every story is worth telling.
And people need stories. Stories of love, hope, survival, wisdom and sometimes pain. ”
In our effort to do the same, we have demonstrated the use of a Cloud enabled Story telling application  to introduce a new system for development of an on-line Community where not only one can share his or her own stories but can also read others’ stories.

> Background

In the past decade, many new apps have emerged which provide a platform for users to connect and share their opinions. These apps lack a feature which enables the user to read according to their present state of mind and filter content accordingly in way which compliments their mood. 
The number of platforms like these which are specifically dedicated to sharing ones experiences from day to day life and enabling users to reach out for stories according to their preferences and state of mind are comparatively very less. In addition to that existing applications lack efficiency in many fields.





> More about Steller App

Steller is the easiest way to discover, create, and share incredible stories with a large no of people using this app.

Steller lets you: 

• Create beautiful visual stories with photos, videos and text right on your Android.

• Personalize the look and feel of your story with elegant color themes based on the story.

• Publish your stories on Steller publicly or privately.

• Embed your stories on your blog and website.

• Like and comment on stories in the Steller community.

• Republish stories into collections to save and share.

• Discover new stories every day on wide range of topics including travel, action + outdoors, photography, food and more.

• Follow your favorite users and topics.

> Languages and Configuration

Operating System on which the app is built: Windows

Operating System on which the app can run: Android version 4.0 or higher

1.  Android Studio is an official IDE for developing Android apps

2. Java Programming language is used to build softwares/apps . It links the UI with the functionalities.

3. XML provides an interface to design the GUI of the apps. 

4. Firebase sends you new data as soon as it’s updated. When your client saves a change to the data, all connected clients receive the updated data almost instantly. All Firebase Real time Database data is stored as JSON objects. You can think of the database as a cloud-hosted JSON tree.
We designed different activities and layouts on Android Studio using XML language. Design.google.com provided all the basic icons, emoticons and color codes required. The functionalities of various buttons and views were linked using java language. SQLite could be used for storage but Firebase provides better functionalities such as auto authentication, real-time storage, etc. Therefore, firebase is used for backend data handling process.


> Descriptive Features of the App:

Steller is a perfect app for reading real life stories. All stories published on the app are our user’s contributions.
•	Login/Register to your account to get personalized dashboard.

The user can login into his account by entering email id/username. If he has not registered into the sharing community, he can make an account by giving details such as name, pen name, email id, a small bio and password. 
•	Select Penname of your own choice and share stories by being anonymous.
The original name of a user will not be displayed anywhere except his/her own personalized dashboard.  Rather, the penname will be visible to all the users.

•	Read stories based on your mood or by search tags of different emotions.


> Different types of searches will be provided to the user:

1. By mood -> stories having tags complementing to the entered tag will be displayed. This will include the title and a small content of the story. On selecting one of the search results, whole story will be displayed. Eg. If a person is feeling sad, cheerful stuff will be put up to lighten up his/her mood.

2. By theme -> if a person wants to read stories of a particular theme/emotion, he can search from a given list of emotions and select stories to read from the results.

3. By penname -> when a person develops a taste for writing style of a certain author, he can go through all of his submissions by searching his penname.
•	Share your own story by being anonymous
Got something interesting to tell, but don’t want to reveal your name? We just display your selected username with the story to every other user. The author needs to enter the theme (which will used later on to attach tags to the story) of the story he’s going to submit and then the whole story.
•	Give reactions to the stories you read
Users will be provided a list of reactions (love, wow, angry, sad, disappointment) through which they can provide a sort of feedback of whatever they read. 
•	Like a story? Pin it for reading it later
If a person finds something interesting but is unable to complete it, he can save/pin it for reading it in future.

> Challenges Faced
1.	Ideation: Designing the front end was simpler than creating a back end since Android Studio provides drag and drop feature. We had to do a little research about how to store our database so that it gets shared with all the devices having Steller app. We found out that firebase provides easy authentication and real time data storage of app data.
2.	We are a group of three 2nd year students who have no experience in development. By the end of approx four hours, we got familiar and comfortable with android studio which helped us in making the front end of our idea. 
3.	We faced a lot of difficulty in getting acquainted with the firebase network. We had problems connecting with the server and being amateurs, we faced a lot of problem understanding the documentation. In our project, we tried to implement email authentication and real-time database storage but couldn’t do it due to server problems.  


> Future Scope:
While the main focus of the project remains on reading and sharing stories of various themes, we can still extend its features as follows:
•	A narrator can be added to the app which will read aloud the selected stories. This feature is of great use for blind people. Additionally, people stuck in traffic can make use of this facility.

•	In order to appreciate an author, the reader can drop a message to the author and thus have a conversation if he/she gets a reply.

•	While submitting a story, the author will not be asked to provide the theme beforehand. Instead, we can store descriptive words of a particular theme/mood and compare the submitted story with these keywords. As a result, the platform decides the theme of the story on its own and adds the required tags on it.

•	Using the storage facility, we can apply a filter on the submissions to remove any kind of vulgarities. The list of words pertaining to certain criteria can be collected from Wikipedia or wordNet.

•	We can check whether or not a similar story has been submitted previously. Our system will not accept such submissions. In this way, we can remove plagiarism from our app.
