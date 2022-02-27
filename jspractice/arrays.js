cities = ["Pune","Hyderabad","Mumbai","Chandigarh"];

citiesCode = cities.map((city) => city.substring(0,3).toUpperCase());
console.log(citiesCode);