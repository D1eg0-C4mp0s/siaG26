var vCandidatos = new Array(4);

vCandidatos[0]=0;
vCandidatos[1]=0;
vCandidatos[2]=0;
vCandidatos[3]=0;



function votapp(usuario,candidato){
	candidato--;
	alert("Gracias por su voto");
	vCandidatos [candidato] += 1;
}

function resultados(){
	data1=document.getElementById('canVotos1').value;
	data2=document.getElementById('canVotos2').value;
	data3=document.getElementById('canVotos3').value;
	data4=document.getElementById('canVotos4').value;
	
	cand1=document.getElementById('idenCandidato1').value;
	cand2=document.getElementById('idenCandidato2').value;
	cand3=document.getElementById('idenCandidato3').value;
	cand4=document.getElementById('idenCandidato4').value;
	
// Obtener una referencia al elemento canvas del DOM
const $grafica = document.querySelector("#grafica");
// Las etiquetas son las que van en el eje X. 
const etiquetas = [cand1,cand2,cand3,cand4]
// Podemos tener varios conjuntos de datos. Comencemos con uno
const datosVotantes2022 = {
    label: "Votos por candidato",
    data: [data1, data2, data3, data4], // La data es un arreglo que debe tener la misma cantidad de valores que la cantidad de etiquetas
    backgroundColor: 'rgba(54, 162, 235, 0.2)', // Color de fondo
    borderColor: 'rgba(54, 162, 235, 1)', // Color del borde
    borderWidth: 1,// Ancho del borde
};
new Chart($grafica, {
    type: 'bar',// Tipo de gráfica
    data: {
        labels: etiquetas,
        datasets: [
            datosVotantes2022,
            // Aquí más datos...
        ]
    },
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero: true
                }
            }],
        },
    }
});
}