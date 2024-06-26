const formList = document.getElementById('formList');
const myList = document.getElementById('myList');
const btnAddList = document.getElementById('btnAddList');
const printList = document.getElementById('printList');

const listTutteCose = [];

btnAddList.addEventListener('click', function(e) {
    e.preventDefault();
    if (!check()) return;
    addList();
    stampList();
    formList.reset();
})


function check() {
	if (myList.value === '') {
		return false;
	} else {
		return true;
	}
}

function addList() {
    listTutteCose.push(myList.value);

    console.log(listTutteCose);
}


function stampList() {
    printList.innerText = '';
    for (let i = 0; i < listTutteCose.length; i++) {
        const newContain = document.createElement('div');
        newContain.classList.add('boxList');
        let newList = document.createElement('p')
        newList.innerText = listTutteCose[i];

        let btnDelete = document.createElement('button');
        btnDelete.setAttribute('onclick', `deleteElementList(${i});`);
        btnDelete.classList.add('delete')
        btnDelete.innerHTML = '<i class="fa fa-trash"></i>'

        newList.addEventListener('click', function(e) {
            if(e.target.style.textDecoration === '') {
                e.target.style.textDecoration = 'line-through';
            } else {
                e.target.style.textDecoration = '';
            }
        })

        printList.appendChild(newContain);
        newContain.appendChild(newList);
        newContain.appendChild(btnDelete);
    }
}


function deleteElementList(element) {
	listTutteCose.splice(element, 1);
	stampList();
}