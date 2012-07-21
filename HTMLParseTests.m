//
//  HTMLParseTests.m
//  DreamCatcher
//
//  Created by James Howard on 8/15/05.
//  Copyright 2005 __MyCompanyName__. All rights reserved.
//

#import "HTMLParseTests.h"
#import "FoundationWebClient.h"
#import "TidyHTMLParser.h"
#import "Page.h"


static NSString* testPage = 
@"<?xml version=\"1.0\"?>"
@"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\""
@"        \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">"
@"<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">"
@"<head>"
@"	<title>DreamCatcher</title>"
@"	<meta name=\"generator\" content=\"BBEdit 8.2\" />"
@"	"
@"		<!--<html:base/>-->"
@""
@"<style type=\"text/css\">"
@""
@"	a.white:link{"
@"		color:white;"
@"	}"
@"	"
@"	a.white:visited{"
@"		color:white;"
@"	}"
@""
@"	a.white:hover{"
@"		color:white;"
@"	}"
@"	"
@"	a.white:active{"
@"		color:white;"
@"	}"
@"	"
@"	a.whiteNoU:link{"
@"		color:white;"
@"		text-decoration:none;"
@"	}"
@"	"
@"	a.whiteNoU:visited{"
@"		color:white;"
@"		text-decoration:none;"
@"	}"
@""
@"	a.whiteNoU:hover{"
@"		color:white;"
@"		text-decoration:none;"
@"	}"
@"	"
@"	a.whiteNoU:active{"
@"		color:white;"
@"		text-decoration:none;"
@"	}"
@""
@"	a.black:link{"
@"		color:black;"
@"	}"
@"	"
@"	a.black:visited{"
@"		color:black;"
@"	}"
@""
@"	a.black:hover{"
@"		color:black;"
@"	}"
@"	"
@"	a.black:active{"
@"		color:black;"
@"	}"
@"	"
@"	a.blackNoU:link{"
@"		color:black;"
@"		text-decoration:none;"
@"	}"
@"	"
@"	a.blackNoU:visited{"
@"		color:black;"
@"		text-decoration:none;"
@"	}"
@""
@"	a.blackNoU:hover{"
@"		color:black;"
@"		text-decoration:underline;"
@"	}"
@"	"
@"	a.blackNoU:active{"
@"		color:black;"
@"		text-decoration:none;"
@"	}"
@""
@"    td.sidebarGray{"
@"		background-color:#666666;"
@"	}"
@""
@"	td.sidebar{"
@"		background-color:#E3D7BC;"
@"    }"
@"</style>"
@"	"
@"</head>"
@"<body>"
@""
@"<script type=\"text/javascript\">"
@" function toggle(id) {"
@"   if (document.getElementById) {"
@"     var el = document.getElementById(id);"
@"   } else if (document.all) {"
@"     var el = document.all(id);"
@"   } else if (document.layers) {"
@"     var el = document.layers[id];"
@"   }"
@""
@"   if (el.style) {"
@"     if (el.style.display == 'none'){"
@"       el.style.display='';"
@"     } else {"
@"       el.style.display='none';"
@"     }"
@"   } else {"
@"     // browser does not support style object,"
@"     // hide some other way (or don't hide?)"
@"   }"
@" }"
@"  "
@"  function show(id) {"
@"  	if (document.getElementById) {"
@"     var el = document.getElementById(id);"
@"   } else if (document.all) {"
@"     var el = document.all(id);"
@"   } else if (document.layers) {"
@"     var el = document.layers[id];"
@"   }"
@""
@"   if (el.style) {"
@"     if (el.style.display == 'none'){"
@"       el.style.display='';"
@" 	 }"
@"   } else {"
@"     // browser does not support style object,"
@"     // hide some other way (or don't hide?)"
@"   }"
@"  }"
@"   "
@"</script>"
@"&nbsp;"
@"<center>"
@"	<img src=\"banner.png\"/>"
@"</center>"
@"The contents of many web sites are often pulled from disparate sources that cannot easily be comprehensively checked for spelling until the site is put together. For instance, a site might pull content from a database that is populated through a content management system, or it might link to pdf, word, or other document formats that are produced separately from the site itself. DreamCatcher simply starts following links within your website, and it checks each page and document as it encounters it for spelling errors. "
@"</body>"
@"</html>";

@interface MockURLResponse : NSURLResponse
{
	NSURL* url;
	NSString* textEncodingName;
}

- (id)initWithURL: (NSURL*)_url
		 encoding: (NSString*)_encoding;

- (NSURL*)URL;
- (NSString*)textEncodingName;

@end


@implementation MockURLResponse

- (id)initWithURL: (NSURL*)_url
		 encoding: (NSString*)_encoding
{
	if(self = [super init]) {
		url = [_url retain];
		textEncodingName = [_encoding retain];
	}
	return self;
}

- (void)dealloc
{
	[url release];
	[textEncodingName release];
	[super dealloc];
}

- (NSURL*)URL
{
	return url;
}

- (NSString*)textEncodingName
{
	return textEncodingName;
}

@end

@implementation HTMLParseTests


- (void)testHTMLParse
{
		
	HTMLContentParser* parser = [[HTMLContentParser alloc] init];
	NSString* result = [parser htmlToText: testPage];
	
	
	NSLog([@"<script language='javascript'>" substringWithRange: NSMakeRange(0, 7)]);
	
	NSLog(result);
	
	
	
	result = [result stringByTrimmingCharactersInSet: [NSCharacterSet whitespaceAndNewlineCharacterSet]];

	STAssertEqualObjects(result, @"The contents of many web sites are often pulled from disparate sources that cannot easily be comprehensively checked for spelling until the site is put together. For instance, a site might pull content from a database that is populated through a content management system, or it might link to pdf, word, or other document formats that are produced separately from the site itself. DreamCatcher simply starts following links within your website, and it checks each page and document as it encounters it for spelling errors.",
						 @"Check that the text has been successfully extracted from the markup");
	
}

- (void)testTidyHTMLParse
{
	TidyHTMLParser* parser = [[TidyHTMLParser alloc] init];
	NSData* data = [testPage dataUsingEncoding: NSUTF8StringEncoding];
	MockURLResponse* resp = [[MockURLResponse alloc] initWithURL: [NSURL URLWithString: @"http://test.net"] 
														encoding: (NSString*)(CFStringConvertEncodingToIANACharSetName(kCFStringEncodingUTF8))];
	NSMutableSet* anchorSet = [NSMutableSet set];
	Page* response = [parser parseContent: data
							 fromResponse: resp
							   setAnchors: anchorSet];
	NSString* result = [response text];
	
	result = [result stringByTrimmingCharactersInSet: [NSCharacterSet whitespaceAndNewlineCharacterSet]];
	
	STAssertEqualObjects(result, @"The contents of many web sites are often pulled from disparate sources that cannot easily be comprehensively checked for spelling until the site is put together. For instance, a site might pull content from a database that is populated through a content management system, or it might link to pdf, word, or other document formats that are produced separately from the site itself. DreamCatcher simply starts following links within your website, and it checks each page and document as it encounters it for spelling errors.",
						 @"Check that the text has been successfully extracted from the markup");
}

@end