from vaderSentiment.vaderSentiment import SentimentIntensityAnalyzer
from termcolor import colored

class SentimentAnalyzer:
    def analyze_sentiment(self, text):
        analyzer = SentimentIntensityAnalyzer()
        sentiment_scores = analyzer.polarity_scores(text)

        if sentiment_scores['compound'] > 0.05:
            return colored("positive", "green")
        elif sentiment_scores['compound'] < -0.05:
            return colored("negative", "red")
        elif sentiment_scores['compound'] >= -0.05 and sentiment_scores['compound'] <= 0.05:
            return colored("neutral", "yellow")
        else:
            return colored("mixed", "blue")

analyzer = SentimentAnalyzer()
result = analyzer.analyze_sentiment("Hello, I'm so exciting")
print(result)