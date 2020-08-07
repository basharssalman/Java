public class Quiz {

		public static void main(String[] args) {
			
			Question question2 = new TrueFalseQuestion("Does 14 countries border China?", "T");
			question2.check();
			
			Question question1 = new MultipleChoiceQuestion("What is 90% of Canada covered by?", "Snow", "Lakes", "Trees", "Sand", "Thick Fog", "B");
			question1.check();
			


			Question question3 = new MultipleChoiceQuestion("What country is also known as Persia?", "Iran", "Iraq", "Istambul", "Mozambique", "Yemmen", "A");
			question3.check();
			
			Question question4 = new TrueFalseQuestion("Beijing is the name given to the northeast part of China.", "NO");
			question4.check();
			
			Question question5 = new MultipleChoiceQuestion("Which of the following countries are separated by the Strait of Gibraltar?", "Portugal and Morocco", "Algeria and Spain", "Morroco and Spain", "England and Iceland", "Algeria and Portugal", "C");
			question5.check();
			
			Question question6 = new TrueFalseQuestion("Is the Great Victoria Desert Located in Australia?", "Y");
			question6.check();
			
			Question question7 = new MultipleChoiceQuestion("Which of the following concept related to the limit beyond stars suffer internal collapse?", "Chandrasekhar limit", "Eddington limit", "Hoyle limit", "Fowler limit", "Fauler limit", "A");
			question7.check();
			
			Question question8 = new TrueFalseQuestion("The Popocatépetl Vorcano is in Japan.", "F");
			question8.check();
			
			Question question9 = new MultipleChoiceQuestion("Where is Nevado del Ruiz Volcano?", "Australia", "Colombia", "Itali", "Japan", "Africa", "B");
			question9.check();
			
			Question question10 = new TrueFalseQuestion("The Cotopaxi Volcano in Ecuador.", "TRUE");
			question10.check();
			
			Question.showResults();
		}

}
