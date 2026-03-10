import numpy as np
import pandas as pd

df = pd.read_csv('data_in/exemplu.csv')
df = pd.read_csv('data_in/exemplu.csv', sep=';') # daca separatorul este ;
df = pd.read_csv('data_in/exemplu.csv', header= None) # daca avem header lipsa ( Header = prima linie este numele coloanelor)


df.to_csv('data_out/rezultat.csv')




