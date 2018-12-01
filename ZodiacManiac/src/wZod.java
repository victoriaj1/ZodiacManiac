//Diane was responsible for this code
import java.util.Date;
public class wZodiac {
	
	public String westZod(int bday, int bmon) {
		Date userBDay = new Date(1, bmon, bday);
		String zWAnswer = "";
		Date firstRange = new Date(1, 1, 20);
		Date secRange = new Date(1, 2, 18);
		Date thirdRange = new Date(1, 2, 19);
		Date fourthRange = new Date(1, 3, 20);
		Date fifthRange = new Date(1, 3, 21);
		Date sixthRange = new Date(1, 4, 19);
		Date seventhRange = new Date(1, 4, 20);
		Date eighthRange = new Date(1, 5, 20);
		Date ninethRange = new Date(1, 5, 21);
		Date tenthRange = new Date(1, 6, 20);
		Date elevRange = new Date(1, 6, 21);
		Date twelRange = new Date(1, 7, 22);
		Date thirtRange = new Date(1, 7, 23);
		Date fourtRange = new Date(1, 8, 22);
		Date fiftRange = new Date(1, 8, 23);
		Date sixtRange = new Date(1, 9, 22);
		Date seventRange = new Date(1, 9, 23);
		Date eighttRange = new Date(1, 10, 22);
		Date ninetRange = new Date(1, 10, 23);
		Date twentRange = new Date(1, 11, 21);
		Date twentoneRange = new Date(1, 11, 22);
		Date twenttwoRange = new Date(1, 12, 21);
		Date twentthreeRange = new Date(1, 12, 22);
		Date twentfourRange = new Date(2, 1, 19);
			
		
		//Aquarius
		String zAquarius = "Strengths: Progressive, original, independent, humanitarian\r\n" + 
				"Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\r\n" + 
				"\r\n" + 
				"Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\r\n" + 
				"Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them\r\n" + 
				"\r\n" + 
				"Aquarius-born are shy and quiet, but on the other hand they can be eccentric and energetic."
				+ "\r\n However, in both cases, they are deep thinkers and highly intellectual people who love helping others. "
				+ "\r\nThey are able to see without prejudice, on both sides, which makes them people who can easily solve problems.\r\n" + 
				"Although they can easily adapt to the energy that surrounds them, "
				+ "\r\nAquarius-born have a deep need to be some time alone and away from everything, in order to restore power."
				+ "\r\n People born under the Aquarius sign, look at the world as a place full of possibilities.\r\n" + 
				"\r\n" + 
				"Aquarius is an air sign, and as such, uses his mind at every opportunity."+
				 "\r\n If there is no mental stimulation, they are bored and lack a motivation to achieve the best result.\r\n" + 
				"\r\n" + 
				"The ruling planet of Aquarius, Uranus has a timid, abrupt and sometimes aggressive nature, but it also gives Aquarius visionary quality. "
				+ "\r\n They are capable of perceiving the future and they know exactly what they want to be doing five or ten years from now.\r\n" + 
				"\r\n" + 
				"Uranus also gave them the power of quick and easy transformation, so they are known as thinkers, progressives and humanists. "
				+ "\r\nThey feel good in a group or a community, so they constantly strive to be surrounded by other people.\r\n" + 
				"\r\n" + 
				"The biggest problem for Aquarius-born is the feeling that they are limited or constrained. "
				+ "\r\nBecause of the desire for freedom and equality for all, they will always strive to ensure freedom of speech and movement."
				+ "\r\n Aquarius-born have a reputation for being cold and insensitive persons, but this is just their defence mechanism against premature intimacy."
				+ "\r\n They need to learn to trust others and express their emotions in a healthy way.";

		
		//Pisces
		String zPisces = "Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\r\n" +  
				"Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\r\n" + 
				"\r\n" + 
				"Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\r\n" + 
				"Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind\r\n" + 
				"\r\n" + 
				"Pisces are very friendly, so they often find themselves in a company of very different people. "
				+ "\r\n Pisces are selfless, they are always willing to help others, without hoping to get anything back.\r\n" + 
				"\r\n" + 
				"Pisces is a Water sign and as such this zodiac sign is characterized by empathy and expressed emotional capacity.\r\n" + 
				" Their ruling planet is Neptune, so Pisces are more intuitive than others and have an artistic talent. "
				+ "\r\n Neptune is connected to music, so Pisces reveal music preferences in the earliest stages of life. "
				+ "\r\n They are generous, compassionate and extremely faithful and caring.\r\n" + 
				"\r\n" + 
				"People born under the Pisces sign have an intuitive understanding of the life cycle and thus achieve the best emotional relationship with other beings.\r\n" + 
				" Pisces-born are known by their wisdom, but under the influence of Uranus, Pisces sometimes can take the role of a martyr, in order to catch the attention."
				+ "\r\n Pisces are never judgmental and always forgiving. They are also known to be most tolerant of all the zodiac signs.";

		
		//Aries
		String zAries = "Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\r\n" + 
				"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\r\n" + 
				"\r\n" + 
				"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\r\n" + 
				"Aries dislikes: Inactivity, delays, work that does not use one's talents\r\n" + 
				"\r\n" + 
				"As the first sign in the zodiac, the presence of Aries always marks the beginning of something energetic and turbulent."
				+ "\r\n They are continuously looking for dynamic, speed and competition, always being the first in everything - from work to social gatherings.\r\n "
				+ "\r\nThanks to its ruling planet Mars and the fact it belongs to the element of Fire (just like Leo and Sagittarius), Aries is one of the most active zodiac signs. "
				+ "\r\n It is in their nature to take action, sometimes before they think about it well.\r\n" + 
				"\r\n" + 
				"The Sun in such high dignity gives them excellent organizational skills, so you'll rarely meet an Aries who isn't capable of finishing several things at once, often before lunch break! "
				+ "\r\n Their challenges show when they get impatient, aggressive and vent anger pointing it to other people."
				+ " \r\n Strong personalities born under this sign have a task to fight for their goals, embracing togetherness and teamwork through this incarnation.\r\n" + 
				"\r\n" + 
				"Aries rules the head and leads with the head, often literally walking head first, leaning forwards for speed and focus. "
				+ "\r\n Its representatives are naturally brave and rarely afraid of trial and risk. "
				+ "\r\n They possess youthful strength and energy, regardless of their age and quickly perform any given tasks.\r\n" + 
				"\r\n" + 
				"Aries - the Flying Ram "
				+ "\r\n Guided by the story of the Golden Fleece, an Aries is ready to be the hero of the day, "
				+ "\r\n fly away and carry many endangered, powerless people on their back. \r\n "
				+ "The power of the ram is carried on his back, for he is the gold itself, shiny and attractive to those ready for betrayal. "
				+ "\r\nThe story of glory that isn't easy to carry is in these two horns, and if this animal doesn't get shorn, allowing change "
				+ "\r\nand giving someone a warm sweater, they won't have much to receive from the world. "
				+ "\r\nEach Aries has a task to share their position, power, gold, or physical strength with other people willingly, "
				+ "\r\n or the energy will be stopped in its natural flow, fear will take over, and the process of giving and receiving will hold balance at zero.";

		
	
		//Taurus
		String zTaurus = "Strengths: Reliable, patient, practical, devoted, responsible, stable\r\n" + 
				"Weaknesses: Stubborn, possessive, uncompromising\r\n" + 
				"\r\n" + 
				"Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\r\n" + 
				"Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics\r\n" + 
				"\r\n" + 
				"Practical and well-grounded, Taurus is the sign that harvests the fruits of labor."
				+ "\r\n They feel the need to always be surrounded by love and beauty, turned to the material world, hedonism, and physical pleasures. "
				+ "\r\nPeople born with their Sun in Taurus are sensual and tactile, considering touch and taste the most important of all senses. "
				+ "\r\n Stable and conservative, this is one of the most reliable signs of the zodiac, ready to endure and stick to their choices until they reach the point of personal satisfaction.\r\n" + 
				"\r\n" + 
				"Taurus is an Earth sign, just like Virgo and Capricorn, and has the ability to see things from a grounded, practical and realistic perspective. "
				+ "\r\n They find it easy to make money and stay on same projects for years, or until they are completed. "
				+ "\r\n What we often see as stubbornness can be interpreted as commitment, and their ability to complete tasks whatever it takes is uncanny. "
				+ "\r\n This makes them excellent employees, great long-term friends and partners, always being there for people they love. "
				+ "\r\n Earthly note makes them overprotective, conservative, or materialistic at times, with views of the world founded on their love of money and wealth.\r\n" + 
				"\r\n" + 
				"The ruler of Taurus is Venus, the planet of love, attraction, beauty, satisfaction, creativity and gratitude. "
				+ "\r\n This tender nature will make Taurus an excellent cook, gardener, lover, and artist. "
				+ "\r\n They are loyal and don't like sudden changes, criticism or the chase of guilt people are often prone to, "
				+ "\r\n being somewhat dependable on other people and emotions they seem to be unable to let go of. "
				+ "\r\n Still, no matter their potential emotional challenge, these individuals have the ability to bring a practical voice of reason in any chaotic and unhealthy situation.\r\n" + 
				"\r\n" + 
				"Taurus – the Wandering Bull "
				+ "\r\n Being the one who betrayed their best friend, goddess Hera herself, this is an unfortunate being that has to wander the Earth in order to find freedom."
				+ "\r\n As if something was always poking them behind their back, reminding them of happiness that once was, "
				+ "\r\n stinging and pushing forwards, they close up in their own worlds, lonely and separated from their core. "
				+ "\r\n To find love, a Taurus has to travel the world, change perspective or make a shift in their entire belief system and their system of values.";

		
		//Gemini
		String zGemini = "Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\r\n" + 
				"Weaknesses: Nervous, inconsistent, indecisive\r\n" + 
				"\r\n" + 
				"Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town\r\n" + 
				"Gemini dislikes: Being alone, being confined, repetition and routine\r\n" + 
				"\r\n" + 
				"Expressive and quick-witted, Gemini represents two different personalities in one and you will never be sure which one you will face. \r\n "
				+ "They are sociable, communicative and ready for fun, with a tendency to suddenly get serious, thoughtful and restless."
				+ " \r\n They are fascinated with the world itself,  extremely curious,"
				+ " \r\n with a constant feeling that there is not enough time to experience everything they want to see.\r\n" + 
				"\r\n" + 
				"The sign of Gemini belongs to the element of Air, accompanying Libra and Aquarius, and this connects it to all aspects of the mind. "
				+ "\r\n It is ruled by Mercury, the planet that represents communication, writing, and movement. "
				+ "\r\n People born under this Sun sign often have a feeling that their other half is missing, so they are forever seeking new friends, mentors, colleagues and people to talk to.\r\n" + 
				"\r\n" + 
				"Gemini's changeable and open mind makes them excellent artists, especially writers and journalists, "
				+ "\r\n and their skills and flexibility make them shine in trade, driving and team sports. "
				+ "\r\n This is a versatile, inquisitive, fun loving sign, born with a wish to experience everything there is out there, in the world. "
				+ "\r\n This makes their character inspiring, and never boring.\r\n" + 
				"\r\n" + 
				"Gemini - the Caring Twins "
				+ "\r\n There is so much childish innocence in the nature of Gemini, telling their tale of brotherhood, love between best friends and relatives "
				+ "\r\n who are entirely different by character, circumstances, physical appearance or upbringing. "
				+ "\r\n They are in this world to mend differences and make them feel right, ready to give their life for a brother or a friend."
				+ "\r\nGemini love sex and fun and are always ready for an intellectual challenge. \r\n"+ 
				"Gemini sees love first through communication and verbal contact, and find it as important as physical contact with their partner."
				+ "\r\n When these two combine, obstacles all seem to fade. Inquisitive and always ready to flirt, "
				+ "\r\n a Gemini could spend a lot of time with different lovers until they find the right one who is able to match their intellect and energy."
				+ "\r\n They need excitement, variety and passion, and when they find the right person, a lover, a friend and someone to talk to combined into one,"
				+ "\r\n they will be faithful and determined to always treasure their heart.";

		
		//Cancer
		String zCancer = "Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive \r\n" + 
				"Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\r\n" + 
				"\r\n"+
				"Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\r\n" + 
				"Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life\r\n" + 
				"\r\n"+
				"Deeply intuitive and sentimental, Cancer can be one of the most challenging zodiac signs to get to know. "
				+ "\r\n They are very emotional and sensitive, and care deeply about matters of the family and their home. Cancer is sympathetic and attached to people they keep close."
				+ "\r\n Those born with their Sun in Cancer are very loyal and able to empathize with other people's pain and suffering."+
				"\r\n"+
				"The sign of Cancer belongs to the element of Water, just like Scorpio and Pisces. "
				+ "\r\n Guided by emotion and their heart, they could have a hard time blending into the world around them. "
				+ "\r\n Being ruled by the Moon, phases of the lunar cycle deepen their internal mysteries and create fleeting emotional patterns that are beyond their control. "
				+ "\r\n As children, they don't have enough coping and defensive mechanisms for the outer world, and have to be approached with care and understanding, for that is what they give in return. \r\n" +
				"\r\n" +
				"Lack of patience or even love will manifest through mood swings later in life, and even selfishness, self-pity or manipulation. "
				+ "\r\n They are quick to help others, just as they are quick to avoid conflict, and rarely benefit from close combat of any kind, always choosing to hit someone stronger, bigger, or more powerful than they imagined. "
				+ "\r\n When at peace with their life choices, Cancer representatives will be happy and content to be surrounded by a loving family and harmony in their home. \r\n" + 
				"\r\n"+
				"Cancer - the Brave Crab "
				+ "r\n Sent to this Earth by something they believe in, only to mess with someone bigger than they are, this isn't an animal aware of their strength. "
				+ "\r\n Patriotism can make them endanger their own wellbeing, fighting for someone else's cause, as if others can become their higher power. "
				+ "\r\n The Crab knows where they're going, but this is often in a wrong direction, at least until they learn their lessons and start relying solely on themselves."; 
		
		
		//Leo
		String zLeo = "Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\r\n" + 
				"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\r\n" + 
				"\r\n" + 
				"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\r\n" + 
				"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen\r\n" + 
				"\r\n" + 
				"People born under the sign of Leo are natural born leaders. "
				+ "\r\n They are dramatic, creative, self-confident, dominant and extremely difficult to resist, able to achieve anything they want to in any area of life they commit to. "
				+ "\r\n There is a specific strength to a Leo and their \"king of the jungle\" status. Leo often has many friends for they are generous and loyal. "
				+ "\r\n Self-confident and attractive, this is a Sun sign capable of uniting different groups of people and leading them as one towards a shared cause, "
				+ "\r\n and their healthy sense of humor makes collaboration with other people even easier.\r\n" + 
				"\r\n" + 
				"Leo belongs to the element of Fire, just like Aries and Sagittarius. This makes them warmhearted, in love with life, trying to laugh and have a good time. "
				+ "\r\n Able to use their mind to solve even the most difficult problems, they will easily take initiative in resolving various complicated situations. "
				+ "\r\n Ruled by the Sun, Leo worships this fiery entity in the sky, quite literally as well as metaphorically. They are in search for self-awareness and in constant growth of ego. "
				+ "\r\n Aware of their desires and personality, they can easily ask for everything they need, but could just as easily unconsciously neglect the needs of other people in their chase for personal gain or status. "
				+ "\r\n When a Leo representative becomes too fond and attached to their achievements and the way other people see them, they become an easy target, ready to be taken down.\r\n" + 
				"\r\n" + 
				"Leo - the Lion in the Cave "
				+ "\r\n The story of the Lion always speaks of bravery. "
				+ "\r\nThis is an animal fearless and impossible to challenge, hurt or destroy, their only weaknesses being fear and aggression towards those they confront. "
				+ "\r\n Living in a cave, a Lion always needs to have one, nesting and finding comfort in hard times.However, they should never stay there for long. "
				+ "\r\n With their head high, they have to face others with dignity and respect, never raising a voice, a hand, or a weapon, bravely walking through the forest they rule.";
		

		//Virgo
		String zVirgo = "Strengths: Loyal, analytical, kind, hardworking, practical\r\n" +  
				"Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\r\n" + 
				"\r\n" + 
				"Virgo likes: Animals, healthy food, books, nature, cleanliness\r\n" + 
				"Virgo dislikes: Rudeness, asking for help, taking center stage\r\n" + 
				"\r\n" + 
				"Virgos are always paying attention to the smallest details and their deep sense of humanity makes them one of the most careful signs of the zodiac. "
				+ "\r\n Their methodical approach to life ensures that nothing is left to chance, and although they are often tender, their heart might be closed for the outer world. "
				+ "\r\n This is a sign often misunderstood, not because they lack the ability to express, "
				+ "\r\n but because they won’t accept their feelings as valid, true, or even relevant when opposed to reason. "
				+ "\r\n The symbolism behind the name speaks well of their nature, born with a feeling they are experiencing everything for the first time.\r\n" + 
				"\r\n" + 
				"Virgo is an Earth sign, fitting perfectly between Taurus and Capricorn. "
				+ "\r\n This will lead to a strong character, but one that prefers conservative, well-organized things and a lot of practicality in their everyday life. "
				+ "\r\n These individuals have an organized life, and even when they let go to chaos, their goals and dreams still have strictly defined borders in their mind. "
				+ "\r\n Constantly worried that they missed a detail that will be impossible to fix, they can get stuck in details, "
				+ "\r\n becoming overly critical and concerned about matters that nobody else seems to care much about.\r\n" + 
				"\r\n" +  
				"Since Mercury is the ruling planet of this sign, its representatives have a well-developed sense of speech and writing, as well as all other forms of communication. "
				+ "\r\n Many Virgos may choose to pursue a career as writers, journalists, and typists, but their need to serve others makes them feel good as caregivers, on a clear mission to help.\r\n" + 
				"\r\n" + 
				"Virgo – the Disappointed Goddess "
				+ "\r\n Seeking goodness in humankind is the story of Virgo, and disappointment seems to be inevitable from their point of view. "
				+ "\r\n The first time they came from their cloud and jumped onto planet Earth, it felt like their mission is to use their existence for good, discovering ways of justice and purity in other people. "
				+ "\r\n Once they fail to find it too many times, Virgos will pull away, get lost, turn to substance abuse, or simply separate from other people to sit on the bench, criticize and judge."; 
		

		//Libra
		String zLibra = "Strengths: Cooperative,diplomatic, gracious, fair-minded, social\r\n" + 
				"Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\r\n" + 
				"\r\n" + 
				"Libra likes: Harmony, gentleness, sharing with others, the outdoors\r\n" + 
				"Libra dislikes: Violence, injustice, loudmouths, conformity\r\n" + 
				"\r\n" + 
				"People born under the sign of Libra are peaceful, fair, and they hate being alone. "
				+ "\r\n Partnership is very important for them, as their mirror and someone giving them the ability to be the mirror themselves. "
				+ "\r\n These individuals are fascinated by balance and symmetry, they are in a constant chase for justice and equality, "
				+ "\r\n realizing through life that the only thing that should be truly important to themselves in their own inner core of personality. "
				+ "\r\n This is someone ready to do nearly anything to avoid conflict, keeping the peace whenever possible\r\n" + 
				"\r\n" +  
				"The sign of Libra is an Air sign, set between Gemini and Aquarius, giving these individuals constant mental stimuli, strong intellect and a keen mind. "
				+ "\r\n They will be inspired by good books, insurmountable discussions and people who have a lot to say. "
				+ "\r\n Each Libra representative has to be careful when talking to other people, for when they are forced to decide about something that is coming their way, "
				+ "\r\n or to choose sides, they suddenly realize that they might be in the wrong place and surrounded by wrong people. "
				+ "\r\n No partner should make them forget that they have their own opinion.\r\n" + 
				"\r\n" + 
				"Planet ruling the sign of Libra is Venus, making these people great lovers but also fond of expensive, material things. "
				+ "\r\n Their lives need to be enriched by music, art, and beautiful places they get a chance to visit.\r\n" + 
				"\r\n" + 
				"Libra – The Measure of Our Souls "
				+ "\r\n The shortest myth of them all seems to present a good analogy to the shortest constellation in the sky, you might even say that it is non-existent, presented by the pliers of Scorpio. "
				+ "\r\n Libra is one dot of balance in the sea of different extremes, manifested only through the fifteenth degree of this magnificent sign, an object among animals and people. "
				+ "\r\n There is something awfully insecure about Libra, as if they were unsure which plate to burden next, aware that things pass and teach us to be careful around other people. "
				+ "\r\n Whatever we do in our lifetimes, only serves to point the way for our Souls towards that “higher power” to finally measure our existence. "
				+ "\r\n Telling us where we went wrong or what we did right, Libras unconsciously teach us that true liberation hides in lightness.";
		
		
		//Scorpio
		String zScorpio = "Strengths: Resourceful, brave, passionate, stubborn, a true friend\r\n" + 
				"Weaknesses: Distrusting, jealous, secretive, violent\r\n" + 
				"\r\n" + 
				"Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\r\n" + 
				"Scorpio dislikes: Dishonesty, revealing secrets, passive people\r\n" + 
				"\r\n" + 
				"Scorpio-born are passionate and assertive people. They are determined and decisive, and will research until they find out the truth. "
				+ "\r\n Scorpio is a great leader, always aware of the situation and also features prominently in resourcefulness.\r\n" + 
				"\r\n" + 
				"Scorpio is a Water sign and lives to experience and express emotions. "
				+ "\r\n Although emotions are very important for Scorpio, they manifest them differently than other water signs. "
				+ "\r\n In any case, you can be sure that the Scorpio will keep your secrets, whatever they may be.\r\n" + 
				"\r\n" + 
				"Pluto is the planet of transformation and regeneration, and also the ruler of this zodiac sign. "
				+ "\r\n Scorpios are known by their calm and cool behavior, and by their mysterious appearance. "
				+ "\r\n People often say that Scorpio-born are fierce, probably because they understand very well the rules of the universe. "
				+"\r\n"
				+"\r\n The Scorpion"+
				"\r\n They are excellent leaders because they are very dedicated to what they do. "
				+ "\r\n Scorpios hate dishonesty and they can be very jealous and suspicious, "
				+ "\r\n so they need to learn how to adapt more easily to different human behaviors. "
				+ "\r\n "
				+ "Scorpios are brave and therefore they are prone to having a lot of friends.";
		

		//Sagittarius
		String zSagittarius = "Strengths: Generous, idealistic, great sense of humor\r\n" + 
				"Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\r\n" + 
				"\r\n" + 
				"Sagittarius likes: Freedom, travel, philosophy, being outdoors\r\n" + 
				"Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details\r\n" + 
				"\r\n" + 
				"Curious and energetic, Sagittarius is one of the biggest travelers among all zodiac signs. "
				+ "\r\n Their open mind and philosophical view motivates them to wander around the world in search of the meaning of life.\r\n" + 
				"\r\n" + 
				"Sagittarius is extrovert, optimistic and enthusiastic, and likes changes. "
				+ "\r\n Sagittarius-born are able to transform their thoughts into concrete actions and they will do anything to achieve their goals.\r\n" + 
				"\r\n" + 
				"Like the other fire signs, Sagittarius needs to be constantly in touch with the world to experience as much as possible. "
				+ "\r\nThe ruling planet of Sagittarius is Jupiter, the largest planet of the zodiac. "
				+ "\r\nTheir enthusiasm has no bounds, and therefore people born under the Sagittarius sign possess a great sense of humor and an intense curiosity.\r\n" + 
				"\r\n" + 
				"Freedom is their greatest treasure, because only then they can freely travel and explore different cultures and philosophies."
				+ "\r\n Because of their honesty, Sagittarius-born are often impatient and tactless when they need to say or do something, "
				+ "\r\n so it's important to learn to express themselves in a tolerant and socially acceptable way.";
		
		
		//Capricorn
		String zCapricorn = "Strengths: Responsible, disciplined, self-control, good managers\r\n" + 
				"Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\r\n" + 
				"\r\n" + 
				"Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\r\n" + 
				"Capricorn dislikes: Almost everything at some point\r\n" + 
				"\r\n" + 
				"Capricorn is a sign that represents time and responsibility, and its representatives are traditional and often very serious by nature. "
				+ "\r\n These individuals possess an inner state of independence that enables significant progress both in their personal and professional lives. "
				+ "\r\n They are masters of self-control and have the ability to lead the way, make solid and realistic plans, and manage many people who work for them at any time. "
				+ "\r\n They will learn from their mistakes and get to the top based solely on their experience and expertise.\r\n" + 
				"\r\n" + 
				"Belonging to the element of Earth , like Taurus and Virgo, this is the last sign in the trio of practicality and grounding. "
				+ "\r\n Not only do they focus on the material world, but they have the ability to use the most out of it. "
				+ "\r\n Unfortunately, this element also makes them stiff and sometimes too stubborn to move from one perspective or point in a relationship. "
				+ "\r\n They have a hard time accepting differences of other people that are too far from their character, "
				+ "\r\n and out of fear might try to impose their traditional values aggressively.\r\n" + 
				"\r\n" + 
				"Saturn is the ruling planet of Capricorn, and this planet represents restrictions of all kinds. "
				+ "\r\n Its influence makes these people practical and responsible, but also cold, distant and unforgiving, prone to the feeling of guilt and turned to the past. "
				+ "\r\n They need to learn to forgive in order to make their own life lighter and more positive.\r\n" + 
				"\r\n" + 
				"Capricorn – the Goat of Fear"
				+ "\r\n A goat with the tail of a fish is created to face fear and create panic. "
				+ "\r\n It is the sign of decisions made to be protected from monsters in our minds, lives, and immediate physical surrounding. "
				+ "\r\n Always ready to transform into something that scares those scary things off, "
				+ "\r\n Capricorn speaks of each natural chain reaction of fear, where one scary thing leads to many others, rising up as defensive mechanisms that only make things worse. "
				+ "\r\n Immersed in their secrecy, they face the world just as they are – brave enough to never run away, but constantly afraid of their inner monsters.";
		

		//begins if statements to find the correct zodiac sign for the birth date (range)
		if (firstRange.compareTo(userBDay) * userBDay.compareTo(secRange) >= 0) {
			zWAnswer= zAquarius;
		}
		else if (thirdRange.compareTo(userBDay) * userBDay.compareTo(fourthRange) >= 0) {
			zWAnswer= zPisces;
		}
		else if (fifthRange.compareTo(userBDay) * userBDay.compareTo(sixthRange) >= 0) {
			zWAnswer= zAries;
		}
		else if (seventhRange.compareTo(userBDay) * userBDay.compareTo(eighthRange) >= 0) {
			zWAnswer= zTaurus;
		}
		else if (ninethRange.compareTo(userBDay) * userBDay.compareTo(tenthRange) >= 0) {
			zWAnswer= zGemini;
		}
		else if (elevRange.compareTo(userBDay) * userBDay.compareTo(twelRange) >= 0) {
			zWAnswer= zCancer;
		}
		else if (thirtRange.compareTo(userBDay) * userBDay.compareTo(fourtRange) >= 0) {
			zWAnswer= zLeo;
		}
		else if (fiftRange.compareTo(userBDay) * userBDay.compareTo(sixtRange) >= 0) {
			zWAnswer= zVirgo;
		}
		else if (seventRange.compareTo(userBDay) * userBDay.compareTo(eighttRange) >= 0) {
			zWAnswer= zLibra;
		}
		else if (ninetRange.compareTo(userBDay) * userBDay.compareTo(twentRange) >= 0) {
			zWAnswer= zScorpio;
		}
		else if (twentoneRange.compareTo(userBDay) * userBDay.compareTo(twenttwoRange) >= 0) {
			zWAnswer= zSagittarius;
		}
		else if (twentthreeRange.compareTo(userBDay) * userBDay.compareTo(twentfourRange) >= 0) {
			zWAnswer= zCapricorn;
		}
		return zWAnswer;
	
	}//end of string

}//end of class
	

//all of the research for zodiac signs came from astrology-zodiac-signs.com
//help with dates was found on stackoverflow.com
