window.onload=()=>{fetch('http://localhost:3306/challenge') // Replace with your server's URL
          .then((response) => response.json())
          .then((data) => {
            document.getElementById('challengeTable').textContent = JSON.stringify(data, null, 2);
          })
          .catch((error) => {
            console.error('Fetch error:', error);
          });

          }