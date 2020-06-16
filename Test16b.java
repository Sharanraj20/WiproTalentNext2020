 ArrayList<Integer> arr = new ArrayList<Integer>();
        //int wordsSize = Integer.parseInt(words.get(0));
        for(int i=0; i<words.size();i++){
            String s = words.get(i);
            int count = 0;

            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(j - 1)) {
                    count++;
                    j++;
                }
            }
            arr.add(count);
        }    
        
        return arr;

    }

}
