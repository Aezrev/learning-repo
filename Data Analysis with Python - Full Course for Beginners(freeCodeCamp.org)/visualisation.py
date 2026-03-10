import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

x = np.arange(-10,20)

plt.figure(figsize=(6,6)) #
plt.title('Titlu grafic')
plt.plot(x,x ** 2)
plt.plot(x, -1 * (x ** 2))
plt.plot(x, x+1, label='x+1') # cu eticheta
plt.plot(x,x,'o') # puncte in loc de linii
plt.legend()
plt.show()

