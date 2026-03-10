#Skipped some parts throughout
# Intro to Numpy

import sys
import numpy as np

# Basic numpy arrays

a = np.array([1,2,3,4,5.5])

# Sintaxa generala: a[start:stop:step]
a[0] #acceseaza primul element
a[0:] #de la 0 la capat
a[1:3] # de la index 1 la 2(3-1)
a[0:-1] #fara pen-ultimul
a[::-1] # tot array-ul inversat

# Array types

a.dtype # => float64
a = np.array([1,2,3,4,5.5], dtype=np.float) #=> specify type

# Dimensions and shapes

A = np.array([1,2,3],[4,5,6],[7,8,9])
B = np.random.randint(5,10, size = (3,3)) #=> genereaza nr random de la 5 la 9 intr-o matrice 3x3
A.shape #=>arata (rows, columns)
A.ndim #=>arata dimensiunile
A.size #=>arata nr de elemente
len(A) #=>arata dimensiunea axei 0

# Indexing and slicing matrices

A[1] #=> arata prima coloana
A[0][0] #=> arata primul element
A[:, :2] #=> arata primele 2 elemente de pe fiecare rand

A[1] = np.array[10,10,10] #=> face al doilea rand sa aiba elemente noi

# Summary statistics

a.sum()
a.sum(a ** 2) # ridica fiecare element la patrat si face suma
a.mean()
a.std()
a.var()
A.sum()
A.sum(axis=0)
A.sum(axis=1)
A.mean(axis=0)
# axis = 0 este pe verticala(randuri)
# axis = 1 este pe orizontala(coloane)
A.sort()

# Broadcasting and Vectorized operations

a + 10 #=> fiecare element primeste operatia
a * 10
a += 100 #=> fiecare element primeste operatia, dar se modifica 'a', nu se creeaza alt Array

l = [0,1,2,3]
[i * 10 for i in l] #=> arata [0,10,20,30]

b = np.arange(4)
a + b #=> face a[0] + b[0] , a[1]+b[1] etc.

# Boolean Arrays (Masks)

a[[True,False,False,True]] #=> selecteaza echivalentul la a[0] a[3]] 
a >= 2 #=> selecteaza elementele >=2 returneaza de ex: array([False,False,True,True])
a[a>=2] #=> returneaza array([2,3])

a[a > a.mean] #=> intoarce elementele > ca mean

# ~ reprezinta NOT
# | reprezinta OR
# & reprezinta AND
# Boolean operators return boolean arrays

# Linear algebra

A.dot(B) # produs matriceal
A @ B # produs matriceal, la fel
B.T # transpusa lui B, transforma (n,p) in (p,n)

# Size of objects in Memory

sys.getsizeof(1) # un nr ocupa 28 biti
np.dtype(int).itemsize
np.array([1]).nbytes

# Useful Numpy functions

np.random.random(size=2) # vector 1D cu 2 valori intre [0,1] de ex: [0.37, 0.91]
np.random.normal(size=2) # distributie normala de ex: [-0.42, 1.13]
np.random.rand(2,4) # vector 1D cu 2 valori intre [0,1], dar matrice 2x4

np.arange(10) # array cu nr intregi de la 0 la 9
np.arange(5,10) # array de la 5 la 9
np.arange(0,1,.1) # aray de la 0 la aproape 1 din .1 in .1 de ex: 0. , 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9

np.arange(10).reshape(2,5) # creeaza un array de la 0 la 9 si il rearanjeaza in matrice 2x5
np.arange(10).reshape(2, -1) # -1 lasa numpy sa gaseasca o dimensiune

np.linspace(0,1,5)
np.linspace(0,1,20,False)

np.zeros(3)
np.zeros((3,3))
np.zeros((3,3), dtype=np.int)
np.ones(5)
np.ones_like(A)
np.empty(5)

np.identity(3)
np.eye(3,3)
np.eye(8,4,k=1)

C = np.copy(A)


