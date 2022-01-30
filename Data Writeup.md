# Project Writeup
### Kirsten Salpukas, Rachel Puckett, Vy Nguyen

## Introduction
Introducing ... AMBIGO.

Today we are often too familiar with seeing headlines from major news articles detailing the struggles faced by Ambulance services, especailly as covid cases continue to rise.

> The American Ambulance Association told the Department of Health and Human Services that “the 911 emergency medical system throughout the United States is at a breaking point.” [NBC News](https://www.nbcnews.com/news/us-news/ambulance-companies-breaking-point-after-receiving-little-covid-aid-n1249586)

> Emergency medical responders in New Orleans have been hit so hard by the resurgence in Covid-19 cases that the city doesn't have the capacity to handle 911 calls, the mayor said Friday as she announced a new mask mandate and a contract to increase EMS resources. [CNN](https://www.cnn.com/2021/07/31/us/new-orleans-covid-19-surge/index.html)

> Heart attack, stroke and burns victims are among the seriously ill and injured patients waiting over an hour for an ambulance to arrive in England and Wales, a BBC investigation shows. [BBC News](https://www.bbc.com/news/health-51269618)

Our project has the goal of reducing some of the pressure on the Ambulance services by providing transportation to non-critical patients. These patients are ones who are facing a non-life threatening illness or injury but still need immidiate medical treatment, such as a broken bone, concussion or labor.

## Background

When looking into solving this issue of a high ambulance demand we first wanted to get a sense of the scale of EMS incidents. We got data from the [City of Austin's Open Data Portal](https://data.austintexas.gov/) and found a data set that partains to EMS incidents by month using data from the past 11 years. They rank EMS incidents based upon a 5 point priority scale in which 1 is the highest priority and 5 is the lowest.

Here is a quick look at the data from the past five year.

| Year | Total Incidents | Priority 1 | Priority 2 | Priority 3 | Priority 4 | Priority 5 |
| ------ | ------ | ------ | ------ | ------ | ------ | ------ |
| 2017 | 128863 | 10955 | 28823 | 28353 | 46134 | 14598 |
| 2018 | 122470 | 9825 | 27775 | 27869 | 42990 | 14011 |
| 2019 | 126480 | 9233 | 29362 | 28629 | 44441 | 14815 |
| 2020 | 119233 | 8495 | 25981 | 28882 | 40008 | 15867 |
| 2021 | 136321 | 10083 | 31238 | 31334 | 46103 | 17563 |

Looking at the data from the past 11 years in graph formats gives us a bit more insight into which categories of priority level are the largest.  
![BarGraph](https://github.com/vyn203/Hackathon-Project/blob/main/Average_Incidents_Bar_Graph.png?raw=true)

![PieChart](https://github.com/vyn203/Hackathon-Project/blob/main/Average_Incidents_Pie_Chart.png?raw=true)

Here we can see that Priority 4 is the largest, making up 36.7% of all EMS incidents. Putting Priorioty 4 and 5 together (the two least life threatening categories) shows us that they make up almost half of all incidents.


## Prototype


[![N|Solid](https://givebycell.com/wp-content/uploads/2015/08/give_mobilewebsiteicon.png)](https://www.figma.com/file/xSZhFlbDJ2T2usY0hvnh4Z/Ambigo?node-id=1%3A74) 

## Features

- Some of the features of this application include Face ID login, in-app payments, injuiry search, location search, family member pickup, favorited locations, driver tracking, trip progress map, and past ride overviews.

## Tech

Here are the applications/methods we used in this project

- [Jupyter Notebook](https://jupyter.org/) - Python in Jupyter Notebook was used for data analysis
- [Figma](https://www.figma.com/) - A vector graphics editor and prototyping tool
- [Android Studio](https://developer.android.com/studio) - An integrated development environment for Google's Android operating system

## Data Citation
Austin-Travis County Emergency Medical Services (2014). EMS – Incidents by Month [data set]. City of Austin, Texas Open Data Portal. Retrieved from https://data.austintexas.gov/Public-Safety/EMS-Incidents-by-Month/gjtj-jt2d.
(accessed Jan 29 2022)
