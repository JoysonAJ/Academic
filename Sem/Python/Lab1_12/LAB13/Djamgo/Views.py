'''------------------------------------------------------------------
Views.py
26.Develop a simple Django app to display welcome message on the browser.
RegNo: 2117010
08-04-2022
------------------------------------------------------------------'''

from django.http import HttpResponse

def Hell(request):
    return HttpResponse("<h1> Hello World </h1>")