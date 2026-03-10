# Pandas Series (Series este 1D)

import pandas as pd
import numpy as np

a = pd.Series([35,36,23,324,34,10.10])
a.name = 'Numere random'
a[2] # accesarea elementului 3
a.values #=> returneaza [ 35.   36.   23.  324.   34.   10.1]
a.index #=> returneaza RangeIndex(start=0, stop=6, step=1)

a.index = ['Numar1','Numar2','Numar3','Numar4','Numar5','Numar6',] #Definire index
a['Numar2'] # accesarea prin index explicit
a.iloc[3] # index numeric

a['Numar1' : 'Numar4'] #slicing; include si ultimul element

# Conditional selection

a > 35 # returneaza boolean series

# Operations and methods

a * 1_000_000 # inmulteste fiecare element
a.mean()
np.log(a) #logaritmeaza
a.sort_values() 
a.sort_values(ascending = False) # pentru DESC
a.sort_index()

a.all()
a.any()

a.max() # intoarce valoarea
a.argmax() #intoarce pozitia 
a.idxmax() # intoarce eticheta 

# Modifying series

a['Numar2'] = 100
a[a == 100] = 200

# Pandas DataFrames (o coloana este o Serie)

df = pd.DataFrame({'Number': [1,2,3,4,5,6,7,8,9], 'Name': ['Nume1','Nume2','Nume3','Nume4','Nume5','Nume6','Nume7','Nume8','Nume9',]}, columns=["Number","Name"])
df.index = ['Index1','Index2','Index3','Index4','Index5','Index6','Index7','Index8','Index9',]
df.columns # returneaza Index(['Number', 'Name'], dtype='object')
# df.info()
df.size
df.shape
# df.describe()
df.dtypes
df['Number'].value_counts
df.value_counts

# Indexing, Selection and Slicing

df.loc['Index1'] # Selectie prin index
df.iloc[-1] # selectie prin index numeric
df['Number'] # selecteaza coloana
df.loc['Index1':'Index3', 'Name'] # de la index 1 la 3, doar coloana Name

# Conditional selection

df['Number'] > 5 # toate nr > 5 , returneaza boolean series

#  Dropping

# df.drop('Index9')
# df.drop(columns="Name")

# Operations

cod = pd.Series([123,123123,4345,45345,64463,534543,345435,36543,4355])
df['Number'].add(cod, fill_value=0) # adauga la coloana number codurile, valori lipsa = 0 !!ADUNA DUPA INDEX
df['Number'] = df['Number'].values + cod.values

# Modifying a dataframe

df['Coduri'] = cod # adauga dupa index
df['Coduri'] = cod.values # indiferent de index

df = df.rename( columns={'Name': "Names"})

# Creating columns from columns

df['Coduri/Numar'] = df['Coduri']/df['Number']
# pd.concat([df['Judet'], df2['Judet']], axis=1)
# df = df.merge(df2[['Siruta', 'Judet']], on='Siruta')
df = df1.merge(df2, on='Siruta')


# Statistical Info

coduri = df['Coduri']
coduri.mean()
coduri.max() 
# etc


