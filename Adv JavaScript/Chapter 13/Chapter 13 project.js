// Chapter Project
// Password Checker
const allowed = ["3467843", "DBaird#63", "password"];
function passwordChecker(pass) {
  return allowed.includes(pass);
}

function login(password) {
  return new Promise((resolve, reject) => {
    if (passwordChecker(password)) {
      resolve({
        status: true,
      });
    } else {
      reject({
        status: false,
      });
    }
  });
}

function checker(pass) {
  login(pass)
    .then((token) => {
      console.log("Approve:");
      console.log(token);
    })
    .catch((value) => {
      console.log("Reject:");
      console.log(value);
    });
}
checker("3467843");
checker("DBaird#63");
checker("password");
checker("54321");
checker("Bob1962");