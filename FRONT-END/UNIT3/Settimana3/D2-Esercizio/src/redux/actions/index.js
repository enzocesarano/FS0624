export const ADD_TO_PREF = "ADD_TO_PREF";
export const REMOVE_FROM_PREF = "REMOVE_FROM_PREF";
export const GET_JOB = "GET_JOB";
export const GET_COMPANY = "GET_COMPANY";

export const addToPref = (pref) => {
  return {
    type: ADD_TO_PREF,
    payload: pref,
  };
};

export const removeFromPref = (pref) => {
  return {
    type: REMOVE_FROM_PREF,
    payload: pref,
  };
};

export const getJob = (query) => {
  const baseEndpoint =
    "https://strive-benchmark.herokuapp.com/api/jobs?search=";

  return (dispatch) => {
    fetch(baseEndpoint + query + "&limit=20")
      .then((response) => {
        if (response.ok) {
          return response.json();
        } else {
          throw new Error("errore nel recupero");
        }
      })
      .then((arrayJob) => {
        dispatch({
          type: GET_JOB,
          payload: arrayJob.data,
        });
      })
      .catch((err) => {
        console.log(err);
      });
  };
};

export const getCompany = (props) => {
  const baseEndpoint =
    "https://strive-benchmark.herokuapp.com/api/jobs?company=";

  return (dispatch) => {
    fetch(baseEndpoint + props.company)
      .then((response) => {
        if (response.ok) {
          return response.json();
        } else {
          throw new Error("errore nel recupero");
        }
      })
      .then((arrayCompany) => {
        dispatch({
          type: GET_COMPANY,
          payload: arrayCompany.data,
        });
      })
      .catch((err) => {
        console.log(err);
      });
  };
};
