@amazon
Feature: To user  verify search box

@regression @smoke
Scenario: To user enter valid product
Given To user launch edge browser and pass amazon url 
When To user enter product in search box 
	    		#2D Map  with header
	    		|samsung   |  iphone |moto             |oppo|
	    		|samsung 24|iphone 14|moto edge 50     |oppo t50|
	    		|samsung 25|iphone 15|moto edge 50 pro |oppo|
	    		
	    		
Then To user click search box button 

 