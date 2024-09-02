const initialState = {
  pref: {
    arrayPref: [],
  },
};

const mainReducer = (state = initialState, action) => {
  switch (action.type) {
    case "ADD_TO_PREF":
      return {
        ...state,
        pref: {
          ...state.pref,
          arrayPref: [...state.pref.arrayPref, action.payload],
        },
      };

    case "REMOVE_FROM_PREF":
      return {
        ...state,
        pref: {
            ...state.pref,
            arrayPref: state.pref.arrayPref.filter(
              (pref) => pref._id !== action.payload._id
            ),
          },
      };

    default: {
      return state;
    }
  }
};

export default mainReducer;
