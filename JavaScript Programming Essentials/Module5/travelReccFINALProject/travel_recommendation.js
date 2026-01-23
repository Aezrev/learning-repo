const searchButton = document.getElementById('btnSearch');
const resetButton = document.getElementById('btnReset');

searchButton.addEventListener('click', searchResults);

function searchResults() {
    const input = document.getElementById('searchInput').value
        .toLowerCase()
        .trim();

    const resultDiv = document.getElementById('result');
    resultDiv.innerHTML = '';

    fetch('travel_recommendation_api.json')
        .then(response => response.json())
        .then(data => {

            let found = false;

            // Normalize keywords
            const isBeach = input === 'beach' || input === 'beaches';
            const isTemple = input === 'temple' || input === 'temples';
            const isCountry = input === 'country' || input === 'countries';

            // 🏖️ Beaches
            if (isBeach) {
                data.beaches.forEach(beach => {
                    found = true;
                    resultDiv.innerHTML += `
                        <h2>${beach.name}</h2>
                        <img src="${beach.imageUrl}" width="300">
                        <p>${beach.description}</p>
                    `;
                });
            }

            // 🛕 Temples
            else if (isTemple) {
                data.temples.forEach(temple => {
                    found = true;
                    resultDiv.innerHTML += `
                        <h2>${temple.name}</h2>
                        <img src="${temple.imageUrl}" width="300">
                        <p>${temple.description}</p>
                    `;
                });
            }

            // 🌍 Countries
            else if (isCountry) {
                data.countries.forEach(country => {
                    found = true;
                    resultDiv.innerHTML += `<h2>${country.name}</h2>`;

                    country.cities.forEach(city => {
                        resultDiv.innerHTML += `
                            <h3>${city.name}</h3>
                            <img src="${city.imageUrl}" width="300">
                            <p>${city.description}</p>
                        `;
                    });
                });
            }

            // 🔍 Search by name (country, city, beach, temple)
            else {
                data.countries.forEach(country => {
                    if (country.name.toLowerCase().includes(input)) {
                        found = true;
                        resultDiv.innerHTML += `<h2>${country.name}</h2>`;
                    }

                    country.cities.forEach(city => {
                        if (city.name.toLowerCase().includes(input)) {
                            found = true;
                            resultDiv.innerHTML += `
                                <h3>${city.name}</h3>
                                <img src="${city.imageUrl}" width="300">
                                <p>${city.description}</p>
                            `;
                        }
                    });
                });

                data.temples.forEach(temple => {
                    if (temple.name.toLowerCase().includes(input)) {
                        found = true;
                        resultDiv.innerHTML += `
                            <h2>${temple.name}</h2>
                            <img src="${temple.imageUrl}" width="300">
                            <p>${temple.description}</p>
                        `;
                    }
                });

                data.beaches.forEach(beach => {
                    if (beach.name.toLowerCase().includes(input)) {
                        found = true;
                        resultDiv.innerHTML += `
                            <h2>${beach.name}</h2>
                            <img src="${beach.imageUrl}" width="300">
                            <p>${beach.description}</p>
                        `;
                    }
                });
            }

            if (!found) {
                resultDiv.innerHTML = '<p>No results found.</p>';
            }
        })
        .catch(error => {
            console.error(error);
            resultDiv.innerHTML = 'Error loading data.';
        });
}

// Reset button
resetButton.addEventListener('click', () => {
    document.getElementById('searchInput').value = '';
    document.getElementById('result').innerHTML = '';
});
