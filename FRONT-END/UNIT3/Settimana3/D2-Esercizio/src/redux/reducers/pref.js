import { ADD_TO_PREF, REMOVE_FROM_PREF } from "../actions";


const initialState = {
  arrayPref: [],
};

const pref = (state = initialState, action) => {
  switch (action.type) {
    case ADD_TO_PREF:
      return {
        ...state,
        arrayPref: [...state.arrayPref, action.payload],
      };

    case REMOVE_FROM_PREF:
      return {
        ...state,
        arrayPref: state.arrayPref.filter(
          (state) => state._id !== action.payload._id
        ),
      };

    default: {
      return state;
    }
  }
};

export default pref;
